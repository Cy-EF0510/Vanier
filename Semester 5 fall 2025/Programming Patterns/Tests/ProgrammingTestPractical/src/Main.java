import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<DigitalAsset> list = new ArrayList<>();
        list.add(new DigitalAsset("VID01", "VIDEO", 250));
        list.add(new DigitalAsset("AUD01", "AUDIO", 15));
        list.add(new DigitalAsset("IMG01", "IMAGE", 5));
        list.add(new DigitalAsset("VID02", "VIDEO", 120));
        list.add(new DigitalAsset("AUD02", "AUDIO", 25));

        Collections.sort(list, new FileSizeComparator());
        list.forEach(System.out::println);

        Double total = (Double) list.stream()
                .filter(e -> e.getAssetType().equals("VIDEO")).
                mapToDouble(e -> (double) e.getFileSizeMB() * 1.05)
                .sum();

        System.out.println("New total size of Videos: " + total);

    }
}