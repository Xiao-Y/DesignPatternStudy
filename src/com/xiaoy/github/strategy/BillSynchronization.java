package com.xiaoy.github.strategy;

/**
 * 账单数据同步
 *
 * @author liuyongtao
 * @since 2021-3-8 15:45
 */
public abstract class BillSynchronization {

    protected String billNo;

    private IParsingData parsingData;
    private ICheckData checkData;
    private ISaveData saveData;
    private IUploadData uploadData;


    public void parsingData() {
        parsingData.parsingData();
    }

    public void checkData() {
        checkData.checkData();
    }

    public void saveData() {
        saveData.saveData();
    }

    public void uploadData() {
        uploadData.uploadData();
    }

    public BillSynchronization setParsingData(IParsingData parsingData) {
        this.parsingData = parsingData;
        return this;
    }

    public BillSynchronization setCheckData(ICheckData checkData) {
        this.checkData = checkData;
        return this;
    }

    public BillSynchronization setSaveData(ISaveData saveData) {
        this.saveData = saveData;
        return this;
    }

    public BillSynchronization setUploadData(IUploadData uploadData) {
        this.uploadData = uploadData;
        return this;
    }
}
