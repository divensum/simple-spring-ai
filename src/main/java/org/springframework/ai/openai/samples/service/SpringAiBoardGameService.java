package org.springframework.ai.openai.samples.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.openai.samples.dto.Answer;
import org.springframework.ai.openai.samples.dto.Question;
import org.springframework.stereotype.Service;

@Service
public class SpringAiBoardGameService implements BoardGameService {

    private final ChatClient chatClient;

    public SpringAiBoardGameService(ChatClient.Builder chatClientBuilder) {
        this.chatClient = chatClientBuilder.build();
    }

    @Override
    public Answer askQuestion(Question question) {
        return new Answer(chatClient.prompt()
                .user(question.question())
                .call()
                .content());
    }
}
