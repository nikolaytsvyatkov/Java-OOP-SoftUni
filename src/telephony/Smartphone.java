package telephony;

import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Smartphone implements Browsable, Callable {
    private static int countCalling = 0;
    private static int countBrowsing = 0;
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    public static int getCountCalling() {
        return countCalling;
    }

    public static int getCountBrowsing() {
        return countBrowsing;
    }

    public List<String> getNumbers() {
        return Collections.unmodifiableList(this.numbers);
    }

    public List<String> getUrls() {
        return Collections.unmodifiableList(this.urls);
    }
    @Override
    public String call() {

        StringBuilder calledNumbers = new StringBuilder();

        getCalledNumbers(calledNumbers);

        return calledNumbers.toString().trim();
    }

    @Override
    public String browse() {

        StringBuilder browserSites = new StringBuilder();

        gerBrowserSites(browserSites);

        return browserSites.toString().trim();

    }

    private void getCalledNumbers(StringBuilder calledNumbers) {
        Pattern pattern = Pattern.compile("^([0-9]+)$");

        for (String number : this.numbers) {
            Matcher matcher = pattern.matcher(number);

            if (matcher.find()){
                calledNumbers.append("Calling... ").append(number).append(System.lineSeparator());
            }else {
                calledNumbers.append("Invalid number!").append(System.lineSeparator());
            }

        }
    }

    private void gerBrowserSites(StringBuilder browsersSites) {
        Pattern pattern = Pattern.compile("^([^0-9]+)$");

        for (String url : this.urls) {
            Matcher matcher = pattern.matcher(url);

            if (matcher.find()){
                browsersSites.append("Browsing: ").append(url).append("!").append(System.lineSeparator());
            }else {
                browsersSites.append("Invalid URL!").append(System.lineSeparator());
            }

        }
    }
}