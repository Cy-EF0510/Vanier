import java.util.Comparator;

public class FileSizeComparator implements Comparator<DigitalAsset> {
    @Override
    public int compare(DigitalAsset o1, DigitalAsset o2) {
        return Integer.compare(o1.getFileSizeMB(), o2.getFileSizeMB());
    }
}
