/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author APCL
 */
public class ProjectDao {
    
    //Admin Dao
    
    public void aSave(Admin a){
        Session s=NewHibernateUtil.getSessionFactory().openSession();
        s.getTransaction().begin();
        s.save(a);
        s.getTransaction().commit();
        s.close();
    }
    public void aDelete(Admin a){
        Session s=NewHibernateUtil.getSessionFactory().openSession();
        s.getTransaction().begin();
        s.save(a);
        s.getTransaction().commit();
        s.close();
    }
    public void aUpdate(Admin a){
        Session s=NewHibernateUtil.getSessionFactory().openSession();
        s.getTransaction().begin();
        s.save(a);
        s.getTransaction().commit();
        s.close();
    }
    public boolean adCheck(String email, String password){
        List<Admin> adlist=new ArrayList<>();
        Session s=NewHibernateUtil.getSessionFactory().openSession();
        Query q=s.createQuery("from Admin where email='"+email+"' and password='"+password+"'");
        adlist=q.list();
            if (adlist.size()>0) {
                   return true;
        } else {
                return false;
        }
    }
    public List<Admin> adShow(){
       List<Admin> alist = new ArrayList<>();
         Session session = NewHibernateUtil.getSessionFactory().openSession();
         Query q = session.createQuery("from Admin");
         alist = q.list();
        return alist;
    }
    
    //Kazi Dao
    
    public void kSave(Kazi k){
        Session s=NewHibernateUtil.getSessionFactory().openSession();
        s.getTransaction().begin();
        s.save(k);
        s.getTransaction().commit();
        s.close();
    }
    public void kDelete(Kazi k){
        Session s=NewHibernateUtil.getSessionFactory().openSession();
        s.getTransaction().begin();
        s.delete(k);
        s.getTransaction().commit();
        s.close();
    }
    public void kUpdate(Kazi k){
        Session s=NewHibernateUtil.getSessionFactory().openSession();
        s.getTransaction().begin();
        s.update(k);
        s.getTransaction().commit();
        s.close();
    }
    public boolean kaCheck(int kaziid, String unionn){
        List<Kazi> list=new ArrayList<>();
        Session s=NewHibernateUtil.getSessionFactory().openSession();
        Query q=s.createQuery("from Kazi where kaziid="+kaziid+" and unionn='"+unionn+"'");
        list=q.list();
            if (list.size()>0) {
                   return true;
        } else {
                return false;
        }
    }
    public List<Kazi> kSearch(String district, String unionn){
       List<Kazi> list = new ArrayList<>();
         Session session = NewHibernateUtil.getSessionFactory().openSession();
         Query q = session.createQuery("from Kazi where district='"+district+"' and unionn='"+unionn+"'");
         list = q.list();
        return list;
    }
    
    public List<Kazi> kShow(){
        List<Kazi> list = new ArrayList<>();
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Query q = session.createQuery("From Kazi");
        list = q.list();
        return list;
    }
    
    
    //Kazi Approval Dao
    
    public void kapSave(Kaziappro k){
        Session s=NewHibernateUtil.getSessionFactory().openSession();
        s.getTransaction().begin();
        s.save(k);
        s.getTransaction().commit();
        s.close();
    }
    
    public void kapUpdate(Kaziappro k){
        Session s=NewHibernateUtil.getSessionFactory().openSession();
        s.getTransaction().begin();
        s.update(k);
        s.getTransaction().commit();
        s.close();
    }
    public boolean kapCheck(String email, String password){
        List<Kaziappro> list=new ArrayList<>();
        Session s=NewHibernateUtil.getSessionFactory().openSession();
        Query q=s.createQuery("from Kaziappro where email='"+email+"' and password='"+password+"'");
        list=q.list();
            if (list.size()>0) {
                   return true;
        } else {
                return false;
        }
    }
    public List <Kaziappro> kapshow(){
        List<Kaziappro> list=new ArrayList<>();
        Session s=NewHibernateUtil.getSessionFactory().openSession();
        Query q=s.createQuery("from Kaziappro");
        list=q.list();
        return list;
    }
    public List<Kaziappro> kapSearch(String district, String unionn){
       List<Kaziappro> kaalist = new ArrayList<>();
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Query q = session.createQuery("from Kaziappro where district='"+ district +"' and unionn='" + unionn + "'");
        kaalist = q.list();
        return kaalist;
    }
    
    // Appointment Dao Series...................................................
    
    public void apSave(Appointment ap){
        Session s=NewHibernateUtil.getSessionFactory().openSession();
        s.getTransaction().begin();
        s.save(ap);
        s.getTransaction().commit();
        s.close();
    }
    public void apDelete(Appointment ap){
        Session s=NewHibernateUtil.getSessionFactory().openSession();
        s.getTransaction().begin();
        s.delete(ap);
        s.getTransaction().commit();
        s.close();
    }
    public void apUpdate(Appointment ap){
        Session s=NewHibernateUtil.getSessionFactory().openSession();
        s.getTransaction().begin();
        s.update(ap);
        s.getTransaction().commit();
        s.close();
    }
    
    public List<Appointment> apSearch(String bnid, String bdop){
       List<Appointment> aplist = new ArrayList<>();
         Session session = NewHibernateUtil.getSessionFactory().openSession();
         Query q = session.createQuery("from Appointment where bnid='"+bnid+"' and bdop='"+bdop+"'");
         aplist = q.list();
        return aplist;
    }
    
    public List<Appointment> apShow(){
       List<Appointment> list = new ArrayList<>();
         Session session = NewHibernateUtil.getSessionFactory().openSession();
         Query q = session.createQuery("from Appointment");
         list = q.list();
        return list;
    }
    
    // New Registration fee Pay
    public void nSave(Nrfeepay n){
        Session s=NewHibernateUtil.getSessionFactory().openSession();
        s.getTransaction().begin();
        s.save(n);
        s.getTransaction().commit();
        s.close();
    }
    public void nDelete(Nrfeepay n){
        Session s=NewHibernateUtil.getSessionFactory().openSession();
        s.getTransaction().begin();
        s.update(n);
        s.getTransaction().commit();
        s.close();
    }
    public void nUpdate(Nrfeepay n){
        Session s=NewHibernateUtil.getSessionFactory().openSession();
        s.getTransaction().begin();
        s.update(n);
        s.getTransaction().commit();
        s.close();
    }
        
    public List<Nrfeepay> nShow(){
       List<Nrfeepay> nrlist = new ArrayList<>();
         Session session = NewHibernateUtil.getSessionFactory().openSession();
         Query q = session.createQuery("from Nrfeepay");
         nrlist = q.list();
        return nrlist;
    }
    
    public List<Nrfeepay> nrfeesearh(String appointmentid){
       List<Nrfeepay> nrlist = new ArrayList<>();
         Session session = NewHibernateUtil.getSessionFactory().openSession();
         Query q = session.createQuery("from Nrfeepay where appointmentid='"+appointmentid+"'");
         nrlist = q.list();
        return nrlist;
    }
    
    // Payment Dao Coding ...........................
    
        public void pSave(Payment p){
        Session s=NewHibernateUtil.getSessionFactory().openSession();
        s.getTransaction().begin();
        s.save(p);
        s.getTransaction().commit();
        s.close();
    }
    public void pDelete(Payment p){
        Session s=NewHibernateUtil.getSessionFactory().openSession();
        s.getTransaction().begin();
        s.delete(p);
        s.getTransaction().commit();
        s.close();
    }
    public void pUpdate(Payment p){
        Session s=NewHibernateUtil.getSessionFactory().openSession();
        s.getTransaction().begin();
        s.update(p);
        s.getTransaction().commit();
        s.close();
    }
        
    public List<Payment> pShow(){
       List<Payment> plist = new ArrayList<>();
         Session session = NewHibernateUtil.getSessionFactory().openSession();
         Query q = session.createQuery("from Payment");
         plist = q.list();
        return plist;
    }
    
    
    
    
//    public void dSave(Divorceform d){
//        Session s=NewHibernateUtil.getSessionFactory().openSession();
//        s.getTransaction().begin();
//        s.save(d);
//        s.getTransaction().commit();
//        s.close();
//    }
//    public void dDelete(Divorceform d){
//        Session s=NewHibernateUtil.getSessionFactory().openSession();
//        s.getTransaction().begin();
//        s.save(d);
//        s.getTransaction().commit();
//        s.close();
//    }
//    public void dUpdate(Divorceform d){
//        Session s=NewHibernateUtil.getSessionFactory().openSession();
//        s.getTransaction().begin();
//        s.save(d);
//        s.getTransaction().commit();
//        s.close();
//    }
//        
//    public List<Divorceform> dShow(){
//       List<Divorceform> dlist = new ArrayList<>();
//         Session session = NewHibernateUtil.getSessionFactory().openSession();
//         Query q = session.createQuery("from Divorceform");
//         dlist = q.list();
//        return dlist;
//    }
    
    
    


//    
//    
//    public void rSave(Registration r){
//        Session s=NewHibernateUtil.getSessionFactory().openSession();
//        s.getTransaction().begin();
//        s.save(r);
//        s.getTransaction().commit();
//        s.close();
//    }
//    public void rDelete(Registration r){
//        Session s=NewHibernateUtil.getSessionFactory().openSession();
//        s.getTransaction().begin();
//        s.save(r);
//        s.getTransaction().commit();
//        s.close();
//    }
//    public void rUpdate(Registration r){
//        Session s=NewHibernateUtil.getSessionFactory().openSession();
//        s.getTransaction().begin();
//        s.save(r);
//        s.getTransaction().commit();
//        s.close();
//    }
//        
//    public List<Registration> rShow(){
//       List<Registration> rlist = new ArrayList<>();
//         Session session = NewHibernateUtil.getSessionFactory().openSession();
//         Query q = session.createQuery("from Registration");
//         rlist = q.list();
//        return rlist;
//    }
//    
//    
//    public void sSave(Seekers ss){
//        Session s=NewHibernateUtil.getSessionFactory().openSession();
//        s.getTransaction().begin();
//        s.save(ss);
//        s.getTransaction().commit();
//        s.close();
//    }
//    public void sDelete(Seekers ss){
//        Session s=NewHibernateUtil.getSessionFactory().openSession();
//        s.getTransaction().begin();
//        s.save(ss);
//        s.getTransaction().commit();
//        s.close();
//    }
//    public void sUpdate(Seekers ss){
//        Session s=NewHibernateUtil.getSessionFactory().openSession();
//        s.getTransaction().begin();
//        s.save(ss);
//        s.getTransaction().commit();
//        s.close();
//    }
//        
//    public List<Seekers> sShow(){
//       List<Seekers> slist = new ArrayList<>();
//         Session session = NewHibernateUtil.getSessionFactory().openSession();
//         Query q = session.createQuery("from Seekers");
//         slist = q.list();
//        return slist;
//    }
//    
//    public void sSave(Seekerscommons sk){
//        Session s=NewHibernateUtil.getSessionFactory().openSession();
//        s.getTransaction().begin();
//        s.save(sk);
//        s.getTransaction().commit();
//        s.close();
//    }
//    public void sDelete(Seekerscommons sk){
//        Session s=NewHibernateUtil.getSessionFactory().openSession();
//        s.getTransaction().begin();
//        s.save(sk);
//        s.getTransaction().commit();
//        s.close();
//    }
//    public void sUpdate(Seekerscommons sk){
//        Session s=NewHibernateUtil.getSessionFactory().openSession();
//        s.getTransaction().begin();
//        s.save(sk);
//        s.getTransaction().commit();
//        s.close();
//    }
//        
//    public List<Seekerscommons> scShow(){
//       List<Seekerscommons> sclist = new ArrayList<>();
//         Session session = NewHibernateUtil.getSessionFactory().openSession();
//         Query q = session.createQuery("from Seekerscommons");
//         sclist = q.list();
//        return sclist;
//    }
    
   
}
