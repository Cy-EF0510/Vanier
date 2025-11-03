public class DigitalAsset {
    private String assetId;
    private String assetType;
    private int fileSizeMB;

    public DigitalAsset(String assetId, String assetType, int fileSizeMB) {
        this.assetId = assetId;
        this.assetType = assetType;
        this.fileSizeMB = fileSizeMB;
    }

    public String getAssetId() {
        return assetId;
    }

    public String getAssetType() {
        return assetType;
    }

    public int getFileSizeMB() {
        return fileSizeMB;
    }

    @Override
    public String toString() {
        return "DigitalAsset{" +
                "assetId='" + assetId + '\'' +
                ", assetType='" + assetType + '\'' +
                ", fileSizeMB=" + fileSizeMB +
                '}';
    }
}
