package dev.martintaylor.transfer_service.enumeration;

public enum MessageType {
    EHR_REQUEST("RCMR_IN010000UK05"),
    EHR_CORE("RCMR_IN030000UK06"),
    CONTINUE_REQUEST("COPC_IN000001UK01"),
    FRAGMENT("COPC_IN000001UK01");

    public final String interactionId;

    MessageType(String interactionId) {
        this.interactionId = interactionId;
    }
}