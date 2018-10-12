package week4.task1;

class main {
        public static void main(String[] args) {
            HoaQua hq = new HoaQua();
            hq.setNgayNhap("9/09/2019");
            System.out.println("Ngay nhap :"+hq.getNgayNhap()+"\t");
            QuaCam qc = new QuaCam();
            qc.setMau("vang - cam");
            System.out.println("mau qua cam"+ qc.getMau());
            qc.setNgayNhap("10/10/2019");
            System.out.println("Ngay nhap qua cam: "+ qc.getNgayNhap()+"\t");
            QuaTao qt = new QuaTao();
            qt.setMuivi("ngon-ngot");
            qt.setGiaBan(25);
            System.out.println("Mui vi qua tao: " +qt.getMuivi() );
            System.out.println("Gia ban qua tao: "+ qt.getGiaBan()+"\t");
            Camcaophong ccp = new Camcaophong();
            ccp.setNgayNhap("10/10/2018");
            ccp.setKichThuoc("hing tron");
            System.out.println("ngay nhap qua cam cao phong: "+ ccp.getNgayNhap());
            System.out.println("Hinh dang cam cao phong: "+ ccp.getKichThuoc());
            CamSanh cs = new CamSanh();
            cs.setGiaBan(30);
            cs.setVoNgoai("san sui");
            System.out.println("Gia ban cam sanh "+ cs.getGiaBan());
            System.out.println("Hinh dang vo ngoai : "+ cs.getVoNgoai());
        }
}
