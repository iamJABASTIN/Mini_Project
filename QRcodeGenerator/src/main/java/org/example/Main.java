package org.example;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

import java.io.IOException;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws WriterException, IOException {
        String Data = "Hello, There..";
        String path = "C:\\Users\\Admin\\Desktop\\QRcode.jpg";
        int width = 200;
        int height = 200;

        BitMatrix matrix =  new MultiFormatWriter().encode(Data, BarcodeFormat.QR_CODE,width,height);

        MatrixToImageWriter.writeToPath(matrix,"jpg", Paths.get(path));

        System.out.println("QR successfully generated...");
    }
}