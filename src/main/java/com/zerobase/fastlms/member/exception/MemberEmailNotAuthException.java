package com.zerobase.fastlms.member.exception;

public class MemberEmailNotAuthException extends RuntimeException {
    public MemberEmailNotAuthException(String error) {
        super(error);
    }
}
