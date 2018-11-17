import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.supercsv.cellprocessor.constraint.NotNull;
import org.supercsv.cellprocessor.ift.CellProcessor;
import org.supercsv.io.CsvBeanReader;
import org.supercsv.io.ICsvBeanReader;
import org.supercsv.prefs.CsvPreference;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        ICsvBeanReader beanReader = null;
        Reader reader = Files.newBufferedReader(Paths.get("iratweets.csv"));
        char separator = ',';
        char quotechar = '"';
        CSVFormat format =  CSVFormat.EXCEL.newFormat(',').withQuote('"');
        CSVParser csvParser = new CSVParser(reader, format.withHeader("tweetid", "userid", "user_display_name", "user_screen_name", "user_reported_location",
                "user_profile_description", "user_profile_url", "follow_count", "following_count", "account_creation_date",
                "account_language", "tweet_language", "tweet_text", "tweet_time", "tweet_client_name", "in_reply_to_tweetid",
                "in_reply_to_userid", "quoted_tweet_tweetid", "is_retweet", "retweet_userid", "retweet_tweetid", "latitude", "longitude",
                "quote_count", "reply_count", "like_count", "retweet_count", "hashtags", "urls", "user_mentions", "poll_choices").
                withIgnoreHeaderCase().withTrim());
        ArrayList<tweet> tweetList = new ArrayList<>();
        int i = 0;
        for(CSVRecord csvRecord : csvParser){
            String tweetid = csvRecord.get(0);
            String userid = csvRecord.get(1);
            String user_display_name = csvRecord.get(2);
            String user_screen_name = csvRecord.get(3);
            String user_profile_description = csvRecord.get(4);
            String user_reported_location = csvRecord.get(5);
            String user_profile_url = csvRecord.get(6);
            String follower_count = csvRecord.get(7);
            String following_count = csvRecord.get(8);
            String account_creation_date = csvRecord.get(9);
            String account_language = csvRecord.get(10);
            String tweet_language = csvRecord.get(11);
            String tweet_text = csvRecord.get(12);
            String tweet_time = csvRecord.get(13);
            String tweet_client_name = csvRecord.get(14);
            String in_reply_to_tweet_id = csvRecord.get(15);
            String in_reply_to_user_id = csvRecord.get(16);
            String quoted_tweet_tweetid = csvRecord.get(17);
            String is_Retweet = csvRecord.get(18);
            String retweet_userid = csvRecord.get(19);
            String retweet_tweetid = csvRecord.get(20);
            String lattitude = csvRecord.get(21);
            String longitude = csvRecord.get(22);
            String quote_count = csvRecord.get(23);
            String reply_count = csvRecord.get(24);
            String like_count = csvRecord.get(25);
            String retweet_count = csvRecord.get(26);
            String hashtags = csvRecord.get(27);
            String urls = csvRecord.get(28);
            String user_mentions = csvRecord.get(29);;
            String poll_choices = csvRecord.get(30);
            tweet curTweet = new tweet(tweetid, userid, user_display_name, user_screen_name, user_reported_location, user_profile_description,
                    user_profile_url, follower_count, following_count, account_creation_date, account_language, tweet_language, tweet_text, tweet_time, tweet_client_name, in_reply_to_tweet_id, in_reply_to_user_id, quoted_tweet_tweetid, is_Retweet, retweet_userid, retweet_tweetid, lattitude, longitude,
                    quote_count, reply_count, like_count, retweet_count, hashtags,  urls,  user_mentions,  poll_choices);
            tweetList.add(curTweet);
            System.out.println("Twitter Account Name: " + tweetList.get(i).getUser_screen_name());
            System.out.println("Account Language: " + tweetList.get(i).getAccount_language());
            System.out.println("Twitter Client Used: " + tweetList.get(i).getTweet_client_name());
            System.out.println("Date tweeted: " + tweetList.get(i).getTweet_time());
            System.out.println(tweetList.get(i).getTweet_text() + "\n\n");
            i++;
        }

    }
}

