package net.xerosoft.service;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class SequenceServiceImpl implements SequenceService {
    private long sequence = 0;

    @Override
    public long next() {
        return sequence++;
    }
}
