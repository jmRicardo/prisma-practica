package com.moby.prisma.jmr.prismapractica.exceptions;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CandidateNotExistsException extends RuntimeException{
    public CandidateNotExistsException(String s) {
        super(s);
        log.error(s);
    }
}
