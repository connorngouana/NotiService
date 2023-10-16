package ie.atu.notificationservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class NotiController
{
    @PostMapping("/noticonfirm")
    public String ConfirmNotiDetails(@RequestBody NotiDetails notiDetails)
    {
        String noti = String.format("User " + notiDetails.getName() +"(" +notiDetails.getEmail() +") has successfully been registered.");
        return noti;
    }
}
