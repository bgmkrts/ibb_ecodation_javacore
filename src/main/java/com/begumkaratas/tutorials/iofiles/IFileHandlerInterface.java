package com.begumkaratas.tutorials.iofiles;

public interface IFileHandlerInterface {
    // Method
    // Dosya yoksa oluştur varsa onu kullan.
    void createFileIfNotExists();

    // Dosya Yaz
    void writeFile(String data);

    // Dosya Oku
    void readFile(String data);
}
