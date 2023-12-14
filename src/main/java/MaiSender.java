import model.LetterModel;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.SimpleEmail;
import static configuration.Config.*;

public class MaiSender {
    //before using set parameters in configuration/Config.class
    public static void sendMail(LetterModel letterModel) {

        try {
            Email email = new SimpleEmail();
            email.setHostName(HOST);
            email.setSmtpPort(PORT);
            email.setAuthenticator(new DefaultAuthenticator(USER_NAME, PASSWORD));
            email.setSSLOnConnect(SSL_FLAG);
            email.setFrom(USER_NAME, SIGNATURE);
            email.setSubject(letterModel.getSubject());
            email.setMsg(letterModel.getMessage()); //message
            email.addTo(letterModel.getToAddress()); //destination address
            email.addCc(letterModel.getAddressForCopy()); //copies
            email.send();

        } catch (Exception exception) {
            System.out.println("Unable to send mail");
            System.out.println(exception);
        }

    }

}
