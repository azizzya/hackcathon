package com.cloudcom2024.store.utils;

import java.nio.file.FileSystems;

import org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

public class QRCodeGenerator {
    private String text;
    private int width;
    private int height;
    private String path;
    
    public QRCodeGenerator(
        String text) {
        this.text = text;
    }

    public void generateImageQRCode() throws WriterException {
        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        BitMatrix bitMatrix = qrCodeWriter.encode(text, BarcodeFormat.QR_CODE, width, height);
        //MatrixToImageWriter.writeToPath(bitMatrix, "PNG", FileSystems.getDefault().getPath(text, null));
    }
}
