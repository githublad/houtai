package com.atguigu.单例;

import com.aspose.pdf.Document;
import com.aspose.pdf.SaveFormat;
import org.junit.jupiter.api.Test;

import java.io.FileOutputStream;

/**
 * @version 1.0
 * @author: lad
 * @createTime: 2022-08-01 13:42
 */
public class Pdf2Word {

    @Test
    //pdf转doc
    public  void pdf2doc( ) {
        String pdfPath ="F:\\hm架构师\\java基础教程\\2020最新BAT java经典必考面试题.pdf";
        long old = System.currentTimeMillis();
        try {
            //新建一个word文档
            String wordPath=pdfPath.substring(0,pdfPath.lastIndexOf("."))+".docx";
            FileOutputStream os = new FileOutputStream(wordPath);
            //doc是将要被转化的word文档
            Document doc = new Document(pdfPath);
            //全面支持DOC, DOCX, OOXML, RTF HTML, OpenDocument, PDF, EPUB, XPS, SWF 相互转换
            doc.save(os, SaveFormat.DocX);
            os.close();
            //转化用时
            long now = System.currentTimeMillis();
            System.out.println("Pdf 转 Word 共耗时：" + ((now - old) / 1000.0) + "秒");
        } catch (Exception e) {
            System.out.println("Pdf 转 Word 失败...");
            e.printStackTrace();
        }
    }

}
