/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Api.*;
import com.google.gson.Gson;
import diviceController.GlobalValues;
import diviceController.dsC;
import dto.DtoCardInfo;
import dto.DtoMessage;
import io.socket.client.IO;
import io.socket.client.Socket;
import org.example.GerritAPI;


import org.ihub.id.SICI;

import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.net.URI;


import org.ihub.id.SICIImpl;

/**
 *
 * @author ASUS1
 */
public class App2 extends javax.swing.JFrame  {
    public JTextField getTxtCCCD() {
        return txtCCCD;
    }

    public String getBo() {
        return bo;
    }

    public void setBo(String bo) {
        this.bo = bo;
    }

    public JLabel getLabImg() {
        return labImg;
    }

    public void setLabImg(JLabel labImg) {
        this.labImg = labImg;
    }

    public JLabel getLabekyc() {
        return labekyc;
    }

    public void setLabekyc(JLabel labekyc) {
        this.labekyc = labekyc;
    }

    public void setTxtCCCD(JTextField txtCCCD) {
        this.txtCCCD = txtCCCD;
    }

    public JTextField getTxtCMND() {
        return txtCMND;
    }

    public void setTxtCMND(JTextField txtCMND) {
        this.txtCMND = txtCMND;
    }

    public JTextField getTxtFullName() {
        return txtFullName;
    }

    public void setTxtFullName(JTextField txtFullName) {
        this.txtFullName = txtFullName;
    }

    public JTextField getTxtNgaySinh() {
        return txtNgaySinh;
    }



    public JButton getBtnExportCSV() {
        return btnExportCSV;
    }

    public void setBtnExportCSV(JButton btnExportCSV) {
        this.btnExportCSV = btnExportCSV;
    }

    public JLabel getCheckAA() {
        return checkAA;
    }

    public void setCheckAA(JLabel checkAA) {
        this.checkAA = checkAA;
    }

    public JLabel getCheckPA() {
        return checkPA;
    }

    public void setCheckPA(JLabel checkPA) {
        this.checkPA = checkPA;
    }

    public JLabel getCheckRar() {
        return checkRar;
    }

    public void setCheckRar(JLabel checkRar) {
        this.checkRar = checkRar;
    }

    public JLabel getJlbKhuonMat() {
        return jlbKhuonMat;
    }

    public void setJlbKhuonMat(JLabel jlbKhuonMat) {
        this.jlbKhuonMat = jlbKhuonMat;
    }

    public JButton getBtnRAR() {
        return btnRAR;
    }

    public void setBtnRAR(JButton btnRAR) {
        this.btnRAR = btnRAR;
    }

    public JButton getBtneKYC() {
        return btneKYC;
    }

    public void setBtneKYC(JButton btneKYC) {
        this.btneKYC = btneKYC;
    }





    public JLabel getLblKNMang() {
        return lblKNMang;
    }

    public void setLblKNMang(JLabel lblKNMang) {
        this.lblKNMang = lblKNMang;
    }

    public JLabel getLblKNThietBi() {
        return lblKNThietBi;
    }

    public void setLblKNThietBi(JLabel lblKNThietBi) {
        this.lblKNThietBi = lblKNThietBi;
    }

    public JTextField getTxtBo() {
        return txtBo;
    }

    public void setTxtBo(JTextField txtBo) {
        this.txtBo = txtBo;
    }

    public JTextField getTxtDDND() {
        return txtDDND;
    }

    public void setTxtDDND(JTextField txtDDND) {
        this.txtDDND = txtDDND;
    }

    public JTextField getTxtDanToc() {
        return txtDanToc;
    }

    public void setTxtDanToc(JTextField txtDanToc) {
        this.txtDanToc = txtDanToc;
    }

    public JTextField getTxtGioiTinh() {
        return txtGioitinh;
    }

    public void setTxtGioiTinh(JTextField txtGioiTinh) {
        this.txtGioitinh = txtGioiTinh;
    }

    public JTextField getTxtMe() {
        return txtMe;
    }

    public void setTxtMe(JTextField txtMe) {
        this.txtMe = txtMe;
    }

    public JTextField getTxtGioitinh() {
        return txtGioitinh;
    }

    public void setTxtGioitinh(JTextField txtGioitinh) {
        this.txtGioitinh = txtGioitinh;
    }

    public JTextField getTxtNgayCap() {
        return txtNgayCap;
    }

    public void setTxtNgayCap(JTextField txtNgayCap) {
        this.txtNgayCap = txtNgayCap;
    }

    public JTextField getTxtNgayHetHan() {
        return txtNgayHetHan;
    }

    public void setTxtNgayHetHan(JTextField txtNgayHetHan) {
        this.txtNgayHetHan = txtNgayHetHan;
    }

    public JTextField getTxtQuequan() {
        return txtQuequan;
    }

    public void setTxtQuequan(JTextField txtQuequan) {
        this.txtQuequan = txtQuequan;
    }

    public JTextField getTxtThuongtru() {
        return txtThuongtru;
    }

    public void setTxtThuongtru(JTextField txtThuongtru) {
        this.txtThuongtru = txtThuongtru;
    }

    public JTextField getTxtTonGiao() {
        return txtTonGiao;
    }

    public void setTxtTonGiao(JTextField txtTonGiao) {
        this.txtTonGiao = txtTonGiao;
    }

    public JTextField getTxtVoChong() {
        return txtVoChong;
    }

    public void setTxtVoChong(JTextField txtVoChong) {
        this.txtVoChong = txtVoChong;
    }

    public void setTxtNgaySinh(JTextField txtNgaySinh) {
        this.txtNgaySinh = txtNgaySinh;
    }

    private String bo;
    private String dantoc;
    private String ddnhandang;
    private String diachithuongtru;
    private String gioitinh;
    private String hinhanh;
    private String me;
    private String ngaycap;
    private String ngayhethan;
    private String ngaysinh;
    private String quequan;
    private String socccd;
    private String socmnd;
    private String ten;
    private String tongiao;
    private String vochong;
    private String nguyenquan;
    private ImageIcon icon;
    ImageIcon photo;
    BaseResponse baseResponse;
    CongDanResponse congDanResponse;
    private boolean isCardReadCompleted;
    private byte[] eidImage;
    ImageIcon face;
    static DtoCardInfo cardInfo;
    /**
     * Creates new form App2
     */
    public App2() {
        initComponents();
        this.jPanel2.setBackground(new Color(0,0,0,0));
        this.jPanel3.setBackground(new Color(0,0,0,0));
        this.jPanel10.setBackground(new Color(0,0,0,0));
        this.jPanel13.setBackground(new Color(0,0,0,0));
        this.txtFullName.setEnabled(false);
        this.txtCCCD.setEnabled(false);
        this.txtCMND.setEnabled(false);
        this.txtNgaySinh.setEnabled(false);
        this.setTitle("TỔNG CÔNG TY CÔNG NGHỆ - VIỄN THÔNG TOÀN CẦU");
        ImageIcon img1 = new ImageIcon(getClass().getResource("/logo-line-01.png"));
        this.setIconImage(img1.getImage());
        this.setSize(1050, 800);
        ImageIcon nen = new ImageIcon(getClass().getResource("/nen.png"));
        this.jLabel4.setIcon(nen);
        this.labImg.setIcon(new ImageIcon(getClass().getResource("/img_placeholder.png")));
        this.labekyc.setIcon(new ImageIcon(getClass().getResource("/img_placeholder_camera.png")));
        this.jLabel1.setIcon(new ImageIcon(getClass().getResource("/logo-line-01.png")));
        URI uri = URI.create("http://192.168.5.1:8000");
        IO.Options options = IO.Options.builder().build();
        Socket socket = IO.socket(uri,options);
        socket.on("/event", args1 -> {

            System.out.println(args1[0]);
            Gson gson = new Gson();
            String json = gson.toJson(args1[0]);
            if (json.contains("message")) {
                DtoMessage message1 = new Gson().fromJson(args1[0].toString(), DtoMessage.class);
                System.out.println("DtoMessage");
            }
            if (json.contains("personalIdentification")) {
                try {
                    cardInfo = new Gson().fromJson(((JSONObject) args1[0]).get("data").toString(), DtoCardInfo.class);
                    System.out.println("333đâsd: " + cardInfo.getIdCode());
                    this.getTxtCCCD().setText(cardInfo.getIdCode());
                    this.getTxtCMND().setText(cardInfo.getOldIdCode());
                    this.getTxtFullName().setText(cardInfo.getPersonName());
                    this.getTxtBo().setText(cardInfo.getFatherName());
                    this.getTxtNgaySinh().setText(cardInfo.getDateOfBirth());
                    this.getTxtGioitinh().setText(cardInfo.getGender());
                    this.getTxtDanToc().setText(cardInfo.getRace());
                    this.getTxtMe().setText(cardInfo.getMotherName());
                    this.getTxtQuequan().setText(cardInfo.getOriginPlace());
                    this.getTxtTonGiao().setText(cardInfo.getReligion());
                    this.getTxtThuongtru().setText(cardInfo.getResidencePlace());
                    this.getTxtVoChong().setText(cardInfo.getWifeName());
                    this.getTxtNgayCap().setText(cardInfo.getIssueDate());
                    this.getTxtNgayHetHan().setText(cardInfo.getExpiryDate());
                    this.getTxtDDND().setText(cardInfo.getPersonalIdentification());
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                System.out.println("DtoCardInfoResponse");
            }
        });

        socket.connect();

    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        checkAA = new javax.swing.JLabel();
        checkPA = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        labImg = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        labekyc = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        txtFullName = new javax.swing.JTextField();
        txtCCCD = new javax.swing.JTextField();
        txtCMND = new javax.swing.JTextField();
        txtNgaySinh = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        btneKYC = new javax.swing.JButton();
        btnRAR = new javax.swing.JButton();
        btnExportCSV = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        checkRar = new javax.swing.JLabel();
        jlbKhuonMat = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        lblKNThietBi = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lblKNMang = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        txtNgayCap = new javax.swing.JTextField();
        txtGioitinh = new javax.swing.JTextField();
        txtNgayHetHan = new javax.swing.JTextField();
        txtTonGiao = new javax.swing.JTextField();
        txtDanToc = new javax.swing.JTextField();
        txtBo = new javax.swing.JTextField();
        txtMe = new javax.swing.JTextField();
        txtVoChong = new javax.swing.JTextField();
        txtDDND = new javax.swing.JTextField();
        txtThuongtru = new javax.swing.JTextField();
        txtQuequan = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS1\\Desktop\\Eid\\IHUB\\donggoi\\ungdung3\\src\\main\\resources\\logo-line-01.png")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("HỆ THỐNG XÁC THỰC THÔNG TIN CÔNG DÂN TRONG CCCD GẮN CHÍP (eID)");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addGap(78, 78, 78)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Thông tin cơ bản:");

        jLabel8.setText("Họ và tên :");

        jLabel9.setText("Số CCCD :");

        jLabel10.setText("Số CMND :");

        jLabel11.setText("Ngày sinh :");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Thông tin bảo mật :");

        jLabel6.setText("Passive Authentication :");

        jLabel13.setText("Active Authentication :");

        checkAA.setText("...");

        checkPA.setText("...");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel6))
                        .addGap(15, 15, 15)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkPA, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkAA, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(checkAA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(checkPA))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Hình chủ thẻ ");

        labImg.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS1\\Desktop\\Eid\\IHUB\\donggoi\\ungdung3\\src\\main\\resources\\img_placeholder.png")); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(labImg))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labImg)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Ảnh chân dung");

        labekyc.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS1\\Desktop\\Eid\\IHUB\\donggoi\\ungdung3\\src\\main\\resources\\img_placeholder_camera.png")); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(labekyc))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labekyc)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                    .addComponent(txtCMND, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFullName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCCCD))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCMND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setText("Xác thực khuôn mặt & BCA :");

        btneKYC.setBackground(new java.awt.Color(147, 18, 13));
        btneKYC.setForeground(new java.awt.Color(255, 255, 255));
        btneKYC.setText("Xác thực khuôn mặt");
        btneKYC.setBorder(null);
        btneKYC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneKYCActionPerformed(evt);
            }
        });

        btnRAR.setBackground(new java.awt.Color(56, 185, 66));
        btnRAR.setForeground(new java.awt.Color(255, 255, 255));
        btnRAR.setText("Xác thực BCA");
        btnRAR.setBorder(null);
        btnRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRARActionPerformed(evt);
            }
        });

        btnExportCSV.setBackground(new java.awt.Color(54, 76, 151));
        btnExportCSV.setForeground(new java.awt.Color(255, 255, 255));
        btnExportCSV.setText("Xuất File CSV");
        btnExportCSV.setBorder(null);
        btnExportCSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExportCSVMouseClicked(evt);
            }
        });
        btnExportCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    btnExportCSVActionPerformed(evt);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        jLabel14.setText("Xác thực BCA :");

        jLabel15.setText("Xác thực khuôn mặt");

        checkRar.setText("Chưa xác thực");

        jlbKhuonMat.setText("Chưa xác thực");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(btneKYC, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExportCSV, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(checkRar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlbKhuonMat, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btneKYC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExportCSV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(checkRar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jlbKhuonMat))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(113, 113, 113))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7))
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11))
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.add(jPanel5);
        jPanel5.setBounds(40, 40, 380, 550);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS1\\Desktop\\Eid\\IHUB\\donggoi\\ungdung3\\src\\main\\resources\\Họa tiết7.png")); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {

            }
        });
        jPanel4.add(jLabel4);
        jLabel4.setBounds(-10, 0, 1240, 620);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("Kết nối thiết bị :");

        lblKNThietBi.setText("...");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("Kết nối Internet:");

        lblKNMang.setText("...");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(lblKNThietBi)
                .addGap(39, 39, 39)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblKNMang)
                .addContainerGap(127, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(lblKNThietBi)
                    .addComponent(jLabel18)
                    .addComponent(lblKNMang))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel32.setText("Ngày cấp :");

        jLabel23.setText("Giới Tính :");

        jLabel24.setText("Hiệu Lực :");

        jLabel25.setText("Tôn Giáo :");

        jLabel26.setText("Dân Tộc : ");

        jLabel27.setText("Tên Bố :");

        jLabel28.setText("Tên Mẹ :");

        jLabel29.setText("Vợ / Chồng:");

        jLabel30.setText("ĐĐND :");

        jLabel31.setText("Thường trú :");

        jLabel33.setText("Quê quán :");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28)
                    .addComponent(jLabel29)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31)
                    .addComponent(jLabel33))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addGap(18, 18, 18)
                .addComponent(jLabel24)
                .addGap(26, 26, 26)
                .addComponent(jLabel25)
                .addGap(18, 18, 18)
                .addComponent(jLabel26)
                .addGap(18, 18, 18)
                .addComponent(jLabel27)
                .addGap(18, 18, 18)
                .addComponent(jLabel28)
                .addGap(28, 28, 28)
                .addComponent(jLabel29)
                .addGap(18, 18, 18)
                .addComponent(jLabel30)
                .addGap(18, 18, 18)
                .addComponent(jLabel31)
                .addGap(18, 18, 18)
                .addComponent(jLabel33)
                .addGap(24, 24, 24))
        );

        txtGioitinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGioitinhActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNgayCap, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtGioitinh)
                    .addComponent(txtNgayHetHan)
                    .addComponent(txtTonGiao)
                    .addComponent(txtDanToc, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBo)
                    .addComponent(txtMe)
                    .addComponent(txtVoChong)
                    .addComponent(txtDDND)
                    .addComponent(txtThuongtru, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtQuequan))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNgayCap, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtGioitinh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNgayHetHan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTonGiao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDanToc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMe, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtVoChong, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDDND, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtThuongtru, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtQuequan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(9, 9, 9))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel12);
        jPanel12.setBounds(460, 40, 450, 470);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtGioitinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGioitinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGioitinhActionPerformed

    private void btneKYCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneKYCActionPerformed
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                FaceTesst frame1 = new FaceTesst(GlobalValues.anhDaiDien);
                frame1.setLocationRelativeTo(null);
                frame1.setVisible(true);
                frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });

        dispose();
    }//GEN-LAST:event_btneKYCActionPerformed

    private void btnRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRARActionPerformed
        this.btnRAR.setEnabled(false);
        System.out.println(dsC.DSC + dsC.CCCD);
        Verify verify = new Verify(
               "ds_cert",
                "so_cccd",
                dsC.DIVICE_TYPE,
                dsC.PROVINCE,
                dsC.CODE
        );
        GerritAPI gerritAPI = ConfigRetrofit.getInstance().getRetrofit().create(GerritAPI.class);

        gerritAPI.verify(verify).enqueue(
                new Callback<BaseResponse>() {
                    @Override
                    public void onResponse(Call<BaseResponse> call, Response<BaseResponse> response) {
                        baseResponse = response.body();
                        GlobalValues.responseApi = response.body();
                        if (baseResponse.data.is_valid_id_card){
                            checkRar.setText("");
                            GlobalValues.checkRar = true;
                            checkRar.setIcon(new ImageIcon(getClass().getResource("/ticxanh12.png")));
//                            txtXacthuc2.setText(baseResponse.data.transaction_code );
                        }else {
                            checkRar.setIcon(new ImageIcon(getClass().getResource("/exit21.png")));
                            GlobalValues.checkRar = false;
                        }
                    }
                    @Override
                    public void onFailure(Call<BaseResponse> call, Throwable throwable) {

                    }
                }
        );
    }//GEN-LAST:event_btnRARActionPerformed



    private void btnExportCSVActionPerformed(java.awt.event.ActionEvent evt) throws IOException {//GEN-FIRST:event_btnExportCSVActionPerformed
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                ExportCSV frame1 = new ExportCSV();
                frame1.setLocationRelativeTo(null);
                frame1.setVisible(true);
                frame1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            }
        });


    }//GEN-LAST:event_btnExportCSVActionPerformed

    private void btnExportCSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExportCSVMouseClicked
        if (GlobalValues.checkRar == true && GlobalValues.CHECK_FACE == true){
            EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    ExportCSV frame1 = new ExportCSV();
                    frame1.setLocationRelativeTo(null);
                    frame1.setVisible(true);
                    frame1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                }
            });
        }else {
            JOptionPane.showConfirmDialog(this, "Vui Lòng Xác thực trước khi xuất CSV","Cảnh Báo!",JOptionPane.OK_CANCEL_OPTION);
        }

    }//GEN-LAST:event_btnExportCSVMouseClicked


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(App2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App2().setVisible(true);
            }
        });
    }

    private void test(){
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExportCSV;
    private javax.swing.JButton btnRAR;
    private javax.swing.JButton btneKYC;
    private javax.swing.JLabel checkAA;
    private javax.swing.JLabel checkPA;
    private javax.swing.JLabel checkRar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel jlbKhuonMat;
    private javax.swing.JLabel labImg;
    private javax.swing.JLabel labekyc;
    private javax.swing.JLabel lblKNMang;
    private javax.swing.JLabel lblKNThietBi;
    private javax.swing.JTextField txtBo;
    private javax.swing.JTextField txtCCCD;
    private javax.swing.JTextField txtCMND;
    private javax.swing.JTextField txtDDND;
    private javax.swing.JTextField txtDanToc;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtGioitinh;
    private javax.swing.JTextField txtMe;
    private javax.swing.JTextField txtNgayCap;
    private javax.swing.JTextField txtNgayHetHan;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtQuequan;
    private javax.swing.JTextField txtThuongtru;
    private javax.swing.JTextField txtTonGiao;
    private javax.swing.JTextField txtVoChong;
    // End of variables declaration//GEN-END:variables
}
