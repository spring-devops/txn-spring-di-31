package testapps.springframework.txnspringdi31.services.data;

public class SimulatedJmsBroker {
    private String JmsUserName;
    private String JmsPassword;
    private String JmsUrl;

    public String getJmsUserName() {
        return JmsUserName;
    }

    public void setJmsUserName(String jmsUserName) {
        JmsUserName = jmsUserName;
    }

    public String getJmsPassword() {
        return JmsPassword;
    }

    public void setJmsPassword(String jmsPassword) {
        JmsPassword = jmsPassword;
    }

    public String getJmsUrl() {
        return JmsUrl;
    }

    public void setJmsUrl(String jmsUrl) {
        JmsUrl = jmsUrl;
    }

    @Override
    public String toString() {
        return "SimulatedJmsBroker{" +
                "JmsUserName='" + JmsUserName + '\'' +
                ", JmsPassword='" + JmsPassword + '\'' +
                ", JmsUrl='" + JmsUrl + '\'' +
                '}';
    }
}
