package Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Alloperations {

	public static void main(String[] args) {
		List<Fruit> fruit = new ArrayList<Fruit>();  
		fruit.add(new Fruit("apple",62,50,"red"));
		fruit.add(new Fruit("banana",112,40,"yellow"));
		fruit.add(new Fruit("berries",72,100,"red"));
		fruit.add(new Fruit("orange",82,80,"orange"));
		fruit.add(new Fruit("grapes",102,100,"black"));
		fruit.add(new Fruit("mango",82,80,"yellow"));
		List<News> nes = new ArrayList<News>();  
		nes.add(new News(12, "User1", "This is good", "Time spent well"));
        nes.add(new News(12, "User2", "Well done budget", "Good Presentation"));
        nes.add(new News(12, "User3", "Very well done", "This was amazing"));
        nes.add(new News(13, "User1", "This was informational budget", "Liked the author"));
        List<Trader>tr=new ArrayList<Trader>();
        tr.add(new Trader("taehyung", "delhi"));
        tr.add(new Trader("namjoon", "indore"));
        tr.add(new Trader("jungkook", "delhi"));
        tr.add(new Trader("jhope", "pune"));
        tr.add(new Trader("jimin", "indore"));
        tr.add(new Trader("jin", "pune"));
        tr.add(new Trader("suga", "pune"));
       List<Transaction>trns=new ArrayList<Transaction>();
      trns.add(new Transaction(new Trader("jungkook", "delhi"), 2012, 4500));
      trns.add(new Transaction(new Trader("tehyung", "delhi"), 2011, 4800));
      trns.add (new Transaction(new Trader("jimin", "indore"), 2011, 4400));
    //1. Fruits with calories less than 100
      System.out.println("Fruits with calories less than 100");
      fruit.stream().filter(x -> x.getcalories() < 100).map(Fruit::getname).sorted( Comparator.reverseOrder() )
      .forEach(System.out::println);
    //2. Sorting fruits according to their color
      System.out.println("Sorting fruits according to their color");
      fruit.stream().sorted(Comparator.comparing(Fruit::getcolor)).map(Fruit::getname).forEach(System.out::println);
      //3. Only red color fruits
      System.out.println("Only red color fruits");
      fruit.stream().filter(x -> x.getcolor().contains("red")).forEach(System.out::println);
    //4. NewsId with maximum comment
      System.out.println("News ID with maximum comment");
      nes.stream().max(Comparator.comparing(News::getcommentedbyuser).reversed()).ifPresent(System.out::println);
    //5. Budget Count
      System.out.println("Counting the word budget in comment");
      int count = (int) nes.stream().filter(x -> x.getcommentedbyuser().contains("budget")).count();
      System.out.println("No. of time word Budget Appeared: " + count);
      //6. User with  Maximum comment
      Optional<String> max = nes.stream().map(News::getcommentedbyuser).max((i, j) -> i.compareTo(j));
      System.out.println(max.get());
      //7. print get comment by user
      System.out.println("print get comment by user");
      nes.stream().max(Comparator.comparing(News::getNewsid).reversed()).map(News::getcommentedbyuser).
      ifPresent(System.out::println);
    //8. Transaction of a particular year
      System.out.println("Transaction of year 2011");
      trns.stream().filter(x -> x.getyear()==2011).sorted(Comparator.comparing(Transaction::getvalue)).forEach(System.out::println);
      //9. Unique cities where trader work from
      System.out.println("Unique cities where trader work from");
      tr.stream().map(Trader::getcity).distinct().forEach(System.out::println);
      //10. Trader who are in pune
      System.out.println("Trader in pune");
      tr.stream().filter(x -> x.getcity().contains("pune")).forEach(System.out::println);
      //11. Trader name sorted alphabetical
      System.out.println("Trader name sorted alphabetical");
      tr.stream().sorted(Comparator.comparing(Trader::gettname)).forEach(System.out::println);
      //12. Are any traders based in indore
      boolean checkindore = tr.stream().anyMatch(x -> x.getcity().contains("indore"));
      System.out.println("Are there any trader based in indore: " + checkindore);
    //13. Transaction from traders living in delhi
      System.out.println("Transaction from traders living in delhi");
      trns.stream().filter(x -> x.gettrader().getcity().contains("delhi")).map(Transaction::getvalue).forEach(System.out::println);

      //14. Highest transaction value
      System.out.println("Highest Transaction value");
      trns.stream().sorted(Comparator.comparing(Transaction::getvalue).reversed()).limit(1).forEach(System.out::println);
      //15. Transaction with smallest value
      System.out.println("Transaction with smallest value");
      trns.stream().sorted(Comparator.comparing(Transaction::getvalue)).limit(1).forEach(System.out::println);

	}

}
