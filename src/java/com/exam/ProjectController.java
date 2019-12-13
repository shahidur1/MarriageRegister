/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author APCL
 */
@Controller
public class ProjectController {
    
    //Admin Controllers
    @RequestMapping("aSave.htm")
    public String adSave(@ModelAttribute("admin") Admin a, Model m) {
        ProjectDao pd= new ProjectDao();
        pd.aSave(a);
        return "adlogin";
    }
    @RequestMapping("alog.htm")
    public String adloging(@ModelAttribute("admin") Admin a, Model m) {
        ProjectDao pd= new ProjectDao();
        if (pd.adCheck(a.getEmail(), a.getPassword())) {
            return "adminpanelf";
        } else {
            return "adlogin";
        }
    }
    
        
    //Kazi Controllers ...................................................
    
    @RequestMapping("kSave.htm")
    public String kaSave(@ModelAttribute("kazi") Kazi a, Model m) {
        ProjectDao pd= new ProjectDao();
        pd.kSave(a);
        return "klogin";
    }
    
    @RequestMapping("kShow.htm")
    public String kaShow(@ModelAttribute("kazi") Kazi a, Model m){
        ProjectDao pd= new ProjectDao();
        List<Kazi> klist=pd.kShow();
        m.addAttribute("klist", klist);
        return "adminpanelf";
    }
    
    @RequestMapping("rdApproval.htm")
    public String doUp(@ModelAttribute("kazi") Kazi k, Model m){
        return "kaziApproval";
    }
    
    @RequestMapping("kupdate.htm")
    public String doUpdate(@ModelAttribute("kazi") Kazi k, Model m){
        ProjectDao pd= new ProjectDao();
        pd.kUpdate(k);
        List<Kazi> list =pd.kShow();
        m.addAttribute("list" , list);
        return "adminpanel";
    }
    
    @RequestMapping("klog.htm")
    public String kloging(@ModelAttribute("kazi") Kazi a, Model m) {
        ProjectDao pd= new ProjectDao();
        if (pd.kaCheck(a.getKaziid(), a.getUnionn())) {
            return "kazipanel";
        } else {
            return "klogin";
        }
    }
        
    @RequestMapping("kaziSearch.htm")
    public String kSearchd(@ModelAttribute("kazi") Kazi k, Model m){
        ProjectDao pd= new ProjectDao();
        List<Kazi> kalist = pd.kSearch(k.getDistrict(), k.getUnionn());
        m.addAttribute("kalist", kalist);
        return "show";
    }
    //Kazi Approval Controllers
    
    @RequestMapping("kapprovalSave.htm")
    public String kappSave(@ModelAttribute("kaziappro") Kaziappro k, Model m) {
        ProjectDao pd= new ProjectDao();
        pd.kapSave(k);
        List<Kaziappro> list = pd.kapshow();
        m.addAttribute("list", list);
        return "adminpanelf";
        
    }
    
    @RequestMapping("kaShow.htm")
    public String kaShow(@ModelAttribute("kaziappro") Kaziappro a, Model m){
        ProjectDao pd= new ProjectDao();
        List<Kaziappro> kalist=pd.kapshow();
        m.addAttribute("kalist", kalist);
        return "adminpanelf";
    }
      
    @RequestMapping("kaziPassword.htm")
    public String kappUpdate(@ModelAttribute("kaziappro") Kaziappro k, Model m) {
        ProjectDao pd= new ProjectDao();
        pd.kapUpdate(k);
        return "null";
    }
    
    @RequestMapping("kapplog.htm")
    public String kappLog(@ModelAttribute("kaziappro") Kaziappro k, Model m) {
        ProjectDao pd= new ProjectDao();
        if (pd.kapCheck(k.getEmail(), k.getPassword())) {
            return "kazipanel_1";
        } else {
            return "klogin";
        }
    }
        
    @RequestMapping("kfbook.htm")
    public String kappSearch(@ModelAttribute("kaziappro") Kaziappro k, Model m) {
        ProjectDao pd= new ProjectDao();
        List<Kaziappro> kaalist = pd.kapSearch(k.getDistrict(), k.getUnionn());
        m.addAttribute("kaalist", kaalist);
        return "appointmentt";
    }
    @RequestMapping("rdAppoint.htm")
    public String doUpapoint(@ModelAttribute("kaziappro") Kaziappro k, Model m){
        return "confirmappoint";
    }
    
    //Booking Appointment Controllers ...................................................
    @RequestMapping("apSave.htm")
    public String appSave(@ModelAttribute("appointment") Appointment ap, Model m) {
        ProjectDao pd= new ProjectDao();
        pd.apSave(ap);
        return "apsuccess";
    }
    
    @RequestMapping("appssShow.htm")
    public String aplShow(@ModelAttribute("appointment") Appointment ap, Model m){
        ProjectDao pd= new ProjectDao();
        List<Appointment> list=pd.apShow();
        m.addAttribute("list", list);
        return "kazioperation";
    }
    @RequestMapping("statuscheck.htm")
    public String apsCheck(@ModelAttribute("appointment") Appointment ap, Model m){
        ProjectDao pd= new ProjectDao();
        List<Appointment> list=pd.apSearch(ap.getBnid(), ap.getBdop());
        m.addAttribute("list", list);
        return "appoitcheck";
    }
    
    
    @RequestMapping("rdpayper.htm")
    public String doUppay(@ModelAttribute("appointment") Appointment ap, Model m){
        return "kazioperation";
    }
    
    @RequestMapping("apUpdated.htm")
    public String appUpdate(@ModelAttribute("appointment") Appointment ap, Model m) {
        ProjectDao pd= new ProjectDao();
        pd.apUpdate(ap);
        return "apsuccess_1";
    }
    
    @RequestMapping("rdnrfee.htm")
    public String doUpnrfee(@ModelAttribute("appointment") Appointment ap, Model m){
        return "kazioperation";
    }
    
    //Nrfeepay Controller Operations
    
    @RequestMapping("nrfeeSave.htm")
    public String nrfeSave(@ModelAttribute("nrfeepay") Nrfeepay nf, Model m) {
        ProjectDao pd= new ProjectDao();
        Double mo=nf.getMohor()*2.5/100;
        nf.setFee(mo);
        Double v=nf.getFee()*16/100;
        nf.setVat(v);
        Double np=nf.getFee()+nf.getVat();
        nf.setNetpay(np);
        pd.nSave(nf);
        List<Nrfeepay> nrlist = pd.nShow();
        m.addAttribute("nrlist", nrlist);
        return "kazioperation";
    }
    
    @RequestMapping("nrShow.htm")
    public String nrShow(@ModelAttribute("nrfeepay") Nrfeepay nf, Model m){
        ProjectDao pd= new ProjectDao();
        List<Nrfeepay> kalist=pd.nShow();
        m.addAttribute("kalist", kalist);
        return "kazioperation";
    }
    
    @RequestMapping("payslipss.htm")
    public String nrpayShow(@ModelAttribute("nrfeepay") Nrfeepay nf, Model m){
        ProjectDao pd= new ProjectDao();
        List<Nrfeepay> nrlist=pd.nrfeesearh(nf.getAppointmentid());
        m.addAttribute("nrlist", nrlist);
        return "payslip";
    }
    
    @RequestMapping("rdtopaid.htm")
    public String doUppiad(@ModelAttribute("nrfeepay") Nrfeepay fn, Model m){
        return "payslip";
    }
    
    // Payment Controller Coding Lines ..............................
    
    @RequestMapping("paidPSave.htm")
    public String ppSave(@ModelAttribute("payment") Payment py, Model m) {
        ProjectDao pd= new ProjectDao();
        String pp="Paid";
        py.setPaystatus(pp);
        Double f=Double.parseDouble(py.getFee());
        Double rf=py.getNetpay()- f;
        Double revenueuponfee=f * 3/100;
        Double revenu=revenueuponfee +rf;
        py.setRevenue(revenu);
        pd.pSave(py);
        List<Payment> plist = pd.pShow();
        m.addAttribute("plist", plist);
        return "payslip";
    }
    
    @RequestMapping("revenueShow.htm")
    public String rvShow(@ModelAttribute("payment") Payment py, Model m){
        ProjectDao pd= new ProjectDao();
        List<Payment> plist=pd.pShow();
        m.addAttribute("plist", plist);
        return "adminpanelf";
    }
    
}
