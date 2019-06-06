package com.yiyun.java8.chap5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamExecrice {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");

        List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300),
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
        );
        // Query 1: Find all transactions from year 2011 and sort them by value (small to high).
        List<Transaction> tr2011 = transactions.stream().filter(d -> d.getYear() == 2011)
            .sorted(Comparator.comparing(Transaction::getValue))
            .collect(Collectors.toList());
        System.out.println("tr2011 = " + tr2011);
        
        // Query 2: What are all the unique cities where the traders work?
        List<String> cities = transactions.stream()
            .map(d -> d.getTrader().getCity())
            .distinct()
            .collect(Collectors.toList());
        System.out.println("cities = " + cities);
        // Query 3: Find all traders from Cambridge and sort them by name.
        List<Trader> traders = transactions.stream().map(Transaction::getTrader)
            .filter(trader -> trader.getCity().equals("Cambridge"))
            .distinct()
            .sorted(Comparator.comparing(Trader::getName))
            .collect(Collectors.toList());
        System.out.println("traders = " + traders);
        // Query 4: Return a string of all traders’ names sorted alphabetically.
        String trader = transactions.stream().map(trans -> trans.getTrader().getName())
            .distinct().sorted()
//            .reduce("", (n1, n2) -> n1 + n2);
        .collect(Collectors.joining());
        System.out.println("trader = " + trader);
        // Query 5: Are there any trader based in Milan?
        boolean milanBased = transactions.stream().anyMatch(d -> d.getTrader().
            getCity().equals("Milan"));
        // Query 6: print the trander all value
        transactions.stream().filter(d->d.getTrader().getCity().equals("Cambridge"))
            .map(Transaction::getValue)
            .forEach(System.out::println);
        // Query 7: What's the highest value in all the transactions?
        Optional<Integer> max = transactions.stream().map(Transaction::getValue)
            .reduce(Integer::max);
        System.out.println("max = " + max.get());
        //Query 8:what is min value
        Optional<Transaction> min = transactions.stream().min(Comparator.comparing(Transaction::getValue));
        System.out.println("min.get() = " + min.get());

    }
}
