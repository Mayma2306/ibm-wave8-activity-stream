package com.stackroute.model;

import com.stackroute.SentimentCalculator.SentimentResult;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class IBMDomainActivityTweet {

    private String timeStamp;
    private String uuid;
    String verb;
    TwitterActor actor;
    String content;
    MyCustomTweet object;
    SentimentResult sentimentResult;
    String domain;
}
