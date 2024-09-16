package org.springframework.ai.openai.samples.service;

import org.springframework.ai.openai.samples.dto.Answer;
import org.springframework.ai.openai.samples.dto.Question;

public interface BoardGameService {
    Answer askQuestion(Question question);
}
