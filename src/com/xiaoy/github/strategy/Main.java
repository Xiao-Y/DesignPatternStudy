package com.xiaoy.github.strategy;

/**
 * @author liuyongtao
 * @since 2021-3-8 15:53
 */
public class Main {

    public static void main(String[] args) {

        BillSynchronizationA billSynchronizationA = new BillSynchronizationA("AAA");
        billSynchronizationA.setCheckData(new CheckDataA())
                .setParsingData(new ParsingDataA())
                .setSaveData(new SaveDataA())
                .setUploadData(new UploadDataA());

        System.out.println(billSynchronizationA.billNo + " 开始执行:");
        billSynchronizationA.parsingData();
        billSynchronizationA.checkData();
        billSynchronizationA.saveData();
        billSynchronizationA.uploadData();


        BillSynchronizationA billSynchronizationB = new BillSynchronizationA("BBB");
        billSynchronizationB.setCheckData(new CheckDataA())
                .setParsingData(new ParsingDataB())
                .setSaveData(new SaveDataA())
                .setUploadData(new UploadDataA());

        System.out.println(billSynchronizationB.billNo + " 开始执行:");
        billSynchronizationB.parsingData();
        billSynchronizationB.checkData();
        billSynchronizationB.saveData();
        billSynchronizationB.uploadData();

    }
}
