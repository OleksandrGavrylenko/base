/*
 * Copyright (c) 2017. iDoc LLC
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 *
 *     (1) Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *     (2) Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in
 *     the documentation and/or other materials provided with the
 *     distribution.
 *
 *     (3)The name of the author may not be used to
 *     endorse or promote products derived from this software without
 *     specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 * IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT,
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,
 * STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING
 * IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */

package ua.papka24.server.db.dto;

import java.io.Serializable;


public class ShareDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final int STATUS_SEND_TO_UNKNOWN_USER = 0;
    public static final int STATUS_SEND_TO_KNOWN_USER = 1;
    public static final int STATUS_VIEW_BY_USERS = 2;
    public static final int STATUS_SIGNED_BY_USERS = 3;
    public static final int STATUS_IN_TRASH = 10;
    public static final int STATUS_ACCESS_DENIED = 100;

    private long resourceId;
    private String user;
    private int status;
    private long time;
    private long tags;
    private String initiator;
    private String comment;

    public ShareDTO(long resourceId, String user, int status, long time, long tags, String initiator, String comment){
        this.resourceId = resourceId;
        this.user = user;
        this.status = status;
        this.time = time;
        this.tags = tags;
        this.initiator = initiator;
        this.comment = comment;
    }

    public ShareDTO(long resourceId, String user, int status, long time, long tags){
        this(resourceId,user,status,time,tags,null,null);
    }

    public String getUser() {
        return user;
    }

    public int getStatus() {
        return status;
    }
}


