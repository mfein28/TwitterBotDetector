

import java.util.List;

public class tweet {
    String tweetid, userid, user_display_name, user_screen_name, user_reported_location, user_profile_description, user_profile_url, follower_count, following_count, account_creation_date, account_language, tweet_language, tweet_text, tweet_time, tweet_client_name, in_reply_to_tweetid, in_reply_to_userid, quoted_tweet_tweetid, retweet_userid, retweet_tweetid, lattitude, longitude, quote_count, reply_count, like_count, retweet_count, urls, user_mentions, poll_choices;
    String hashtags;
    String is_Retweet;


    tweet(String tweetid, String userid, String user_display_name, String user_screen_name, String user_profile_description, String user_reported_location, String user_profile_url, String follower_count, String following_count, String account_creation_date, String account_language, String tweet_language, String tweet_text, String tweet_time, String tweet_client_name, String in_reply_to_tweetid, String in_reply_to_userid, String quoted_tweet_tweetid, String is_Retweet, String retweet_userid, String retweet_tweetid, String latitude, String longitude, String quote_count, String reply_count, String like_count, String retweet_count, String hashtags, String urls, String user_mentions, String poll_choices){
        this.tweetid = tweetid;
        this.userid = userid;
        this.user_display_name = user_display_name;
        this.user_screen_name = user_screen_name;
        this.user_reported_location = user_reported_location;
        this.user_profile_description = user_profile_description;
        this.user_profile_url = user_profile_url;
        this.follower_count = follower_count;
        this.following_count = following_count;
        this.account_creation_date = account_creation_date;
        this.account_language = account_language;
        this.tweet_language = tweet_language;
        this.tweet_text = tweet_text;
        this.tweet_time = tweet_time;
        this.tweet_client_name = tweet_client_name;
        this.in_reply_to_tweetid = in_reply_to_tweetid;
        this.in_reply_to_userid = in_reply_to_userid;
        this.quoted_tweet_tweetid = quoted_tweet_tweetid;
        this.is_Retweet = is_Retweet;
        this.retweet_userid = retweet_userid;
        this.retweet_tweetid = retweet_tweetid;
        this.lattitude = latitude;
        this.longitude = longitude;
        this.quote_count = quote_count;
        this.reply_count = reply_count;
        this.like_count = like_count;
        this.retweet_count = retweet_count;
        this.urls = urls;
        this.user_mentions = user_mentions;
        this.poll_choices = poll_choices;
        this.hashtags = hashtags;


    }

    public String getTweetid() {
        return tweetid;
    }

    public String getUserid() {
        return userid;
    }

    public String getUser_display_name() {
        return user_display_name;
    }

    public String getUser_screen_name() {
        return user_screen_name;
    }

    public String getUser_reported_location() {
        return user_reported_location;
    }

    public String getUser_profile_description() {
        return user_profile_description;
    }

    public String getUser_profile_url() {
        return user_profile_url;
    }

    public String getFollower_count() {
        return follower_count;
    }

    public String getFollowing_count() {
        return following_count;
    }

    public String getAccount_creation_date() {
        return account_creation_date;
    }

    public String getAccount_language() {
        return account_language;
    }

    public String getTweet_language() {
        return tweet_language;
    }

    public String getTweet_text() {
        return tweet_text;
    }

    public String getTweet_time() {
        return tweet_time;
    }

    public String getTweet_client_name() {
        return tweet_client_name;
    }

    public String getIn_reply_to_tweetid() {
        return in_reply_to_tweetid;
    }

    public String getIn_reply_to_userid() {
        return in_reply_to_userid;
    }

    public String getQuoted_tweet_tweetid() {
        return quoted_tweet_tweetid;
    }

    public String getRetweet_userid() {
        return retweet_userid;
    }

    public String getRetweet_tweetid() {
        return retweet_tweetid;
    }

    public String getLattitude() {
        return lattitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getQuote_count() {
        return quote_count;
    }

    public String getReply_count() {
        return reply_count;
    }

    public String getLike_count() {
        return like_count;
    }

    public String getRetweet_count() {
        return retweet_count;
    }

    public String getUrls() {
        return urls;
    }

    public String getUser_mentions() {
        return user_mentions;
    }

    public String getPoll_choices() {
        return poll_choices;
    }

    public String getHashtags() {
        return hashtags;
    }

    public String getIs_Retweet() {
        return is_Retweet;
    }

}


