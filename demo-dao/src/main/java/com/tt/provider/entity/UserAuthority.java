package com.tt.provider.entity;

import javax.persistence.*;

@Table(name = "user_authority")
public class UserAuthority {
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "authority_id")
    private Long authorityId;

    /**
     * @return user_id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * @return authority_id
     */
    public Long getAuthorityId() {
        return authorityId;
    }

    /**
     * @param authorityId
     */
    public void setAuthorityId(Long authorityId) {
        this.authorityId = authorityId;
    }
}