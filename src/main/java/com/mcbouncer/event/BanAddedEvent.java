package com.mcbouncer.event;

import com.mcbouncer.util.BanType;
import net.lahwran.fevents.MCBEvent;
import net.lahwran.fevents.MCBHandlerList;

public class BanAddedEvent extends MCBEvent<BanAddedEvent> {

    private String user;
    private String issuer;
    private String reason;
    private String error;
    private boolean success;
    public static final MCBHandlerList<BanAddedEvent> handlers = new MCBHandlerList<BanAddedEvent>();

    public BanAddedEvent(BanType banType, String user, String issuer, String reason, boolean success, String error) {
        this.banType = banType;
        this.user = user;
        this.reason = reason;
        this.issuer = issuer;
        this.success = success;
        this.error = error;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setBanType(BanType banType) {
        this.banType = banType;
    }
    private BanType banType;

    public BanType getBanType() {
        return banType;
    }

    @Override
    protected MCBHandlerList<BanAddedEvent> getHandlers() {
        return handlers;
    }

    @Override
    protected String getEventName() {
        return "BanAdded";
    }
}
