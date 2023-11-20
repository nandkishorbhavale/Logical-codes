import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;

public class EmailSender {

    public static void main(String[] args) {
        sendEmail();
    }

    private static void sendEmail() {
        // Email configuration
        String senderEmail = "nandkishor.bhavale@dalisoft.in";
        String senderPassword = "gcbu mlju fora pioa";
        String recipientEmail1 = "Sri.Ganesh@asia.meap.com";
        String recipientEmail2 = "vishal.kumar@dalisoft.in";
        String recipientEmail3 = "rohit.marathe@dalisoft.in";
        String subject = "Daily Shift-end Report";
        String body = "Please find the Shift-end report attached.";

        // Set up the JavaMail session
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(senderEmail, senderPassword);
            }
        });

        try {
            // Create message
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(senderEmail));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(recipientEmail1 + "," + recipientEmail2 + "," + recipientEmail3));
            message.setSubject(subject);

            // Create the body part
            BodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText(body);

            // Create the multipart message
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);

            // Attach file 1
            String attachmentPath1 = "C:\\D Drive\\TI project\\Application\\Reports\\DownloadReportEveryShiftEnd\\20231120110352419-Genealogy-Report-Date-Wise.xlsx";
            addAttachment(multipart, attachmentPath1);

            // Attach file 2
            String attachmentPath2 = "C:\\D Drive\\TI project\\Application\\Reports\\DownloadReportEveryShiftEnd\\20231120110556302-Quality_Report2023-11-17-00-00-00.xlsx";
            addAttachment(multipart, attachmentPath2);

            // Set the content of the message
            message.setContent(multipart);

            // Send the message
            Transport.send(message);

            System.out.println("Email Sent");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    private static void addAttachment(Multipart multipart, String filePath) throws MessagingException {
        BodyPart attachmentBodyPart = new MimeBodyPart();
        DataSource source = new FileDataSource(filePath);
        attachmentBodyPart.setDataHandler(new DataHandler(source));
        attachmentBodyPart.setFileName(source.getName());
        multipart.addBodyPart(attachmentBodyPart);
    }
}
