package com.wordfrequency;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class WordFrequencySorted
{
  public static void main(String[] args)
  {
    String text = "A paragraph is a series of related sentences developing a central idea, called the topic. Try to think about paragraphs in terms of thematic unity: a paragraph is a sentence or a group of sentences that supports one central, unified idea. Paragraphs add one idea at a time to your broader argument.";
    List<String> words = Arrays.asList(text.split(" "));
    Map<String, Long> wordCounts = words.stream().collect(groupingBy(Function.identity(), counting()));
    LinkedHashMap<String, Long> sortedWordFreq = wordCounts.entrySet()
            .stream()
            .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

    sortedWordFreq.entrySet().stream().map(entry -> entry.getKey() + " : " + entry.getValue()).forEach(System.out::println);
  }
}
