package DBGeneration_tool;

import com.assignment.entity.ChiTietSanPham;
import com.assignment.entity.ChucVu;
import com.assignment.entity.CuaHang;
import com.assignment.entity.DongSp;
import com.assignment.entity.GioHang;
import com.assignment.entity.HoaDon;
import com.assignment.entity.HoaDonChiTiet;
import com.assignment.entity.KhachHang;
import com.assignment.entity.MauSac;
import com.assignment.entity.NSX;
import com.assignment.entity.NhanVien;
import com.assignment.entity.SanPham;
import com.assignment.repository.ChiTietSanPhamRepository;
import com.assignment.repository.ChuVuRepository;
import com.assignment.repository.CuaHanRepository;
import com.assignment.repository.DongSpRepository;
import com.assignment.repository.GioHangChiTietRepository;
import com.assignment.repository.GioHangRepository;
import com.assignment.repository.HoaDonChiTietRepository;
import com.assignment.repository.HoaDonRepository;
import com.assignment.repository.KhachHangRepository;
import com.assignment.repository.MauSacRepository;
import com.assignment.repository.NSXRepository;
import com.assignment.repository.NhanVienRepository;
import com.assignment.repository.SanPhamRepository;
import com.assignment.utils.DateTimeUtil;
import com.assignment.utils.GeneraterMa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.math.BigDecimal;

@SpringBootApplication
@EnableJpaRepositories(
        basePackages = "com.assignment.repository"
)
public class DBGeneration  implements CommandLineRunner {

    @Autowired
    private ChuVuRepository chuVuRepository;

    @Autowired
    private CuaHanRepository cuaHanRepository;

    @Autowired
    private DongSpRepository dongSpRepository;

    @Autowired
    private GioHangChiTietRepository gioHangChiTietRepository;

    @Autowired
    private GioHangRepository gioHangRepository;

    @Autowired
    private HoaDonChiTietRepository hoaDonChiTietRepository;

    @Autowired
    private HoaDonRepository hoaDonRepository;

    @Autowired
    private KhachHangRepository khachHangRepository;

    @Autowired
    private MauSacRepository mauSacRepository;

    @Autowired
    private NhanVienRepository nhanVienRepository;

    @Autowired
    private NSXRepository nsxRepository;

    @Autowired
    private SanPhamRepository sanPhamRepository;

    @Autowired
    private ChiTietSanPhamRepository chiTietSanPhamRepository;

    @Override
    public void run(String... args) throws Exception {

        ChucVu chucVu = new ChucVu();
        chucVu.setMa("CV01");
        chucVu.setTen("Nhân viên");
        chucVu.setId(chuVuRepository.save(chucVu).getId());

        ChucVu chucVu1 = new ChucVu();
        chucVu1.setMa("CV02");
        chucVu1.setTen("Quản lý");
        chucVu1.setId(chuVuRepository.save(chucVu1).getId());

        CuaHang cuaHang = new CuaHang();
        cuaHang.setMa("CH01");
        cuaHang.setTen("Cửa Hàng Vui Vẻ");
        cuaHang.setDiaChi("Trịnh Văn Bô, Nam Từ Niêm, Hà Nội");
        cuaHang.setId(cuaHanRepository.save(cuaHang).getId());

        DongSp dongSp = new DongSp();
        dongSp.setTen("Dong 1");
        dongSp.setMa("DONG01");
        dongSp.setId(dongSpRepository.save(dongSp).getId());

        DongSp dongSp1 = new DongSp();
        dongSp1.setTen("dongSp1");
        dongSp1.setMa("dongSp1");
        dongSp1.setId(dongSpRepository.save(dongSp1).getId());

        DongSp dongSp2 = new DongSp();
        dongSp2.setTen("dongSp2");
        dongSp2.setMa("dongSp2");
        dongSp2.setId(dongSpRepository.save(dongSp2).getId());

        MauSac mauSac = new MauSac();
        mauSac.setMa("#000");
        mauSac.setTen("Black");
        mauSac.setId(mauSacRepository.save(mauSac).getId());

        MauSac mauSac1 = new MauSac();
        mauSac1.setMa("#fff");
        mauSac1.setTen("White");
        mauSac1.setId(mauSacRepository.save(mauSac1).getId());

        MauSac mauSac2 = new MauSac();
        mauSac2.setMa("#FF0000");
        mauSac2.setTen("Red");
        mauSac2.setId(mauSacRepository.save(mauSac2).getId());

        MauSac mauSac3 = new MauSac();
        mauSac3.setMa("#00FF00");
        mauSac3.setTen("Lime");
        mauSac3.setId(mauSacRepository.save(mauSac3).getId());

        SanPham sanPham = new SanPham();
        sanPham.setTen("Sản phẩm 1");
        sanPham.setMa("SP001");
        sanPham.setId(sanPhamRepository.save(sanPham).getId());

        SanPham sanPham1 = new SanPham();
        sanPham1.setTen("Sản phẩm 2");
        sanPham1.setMa("SP002");
        sanPham1.setId(sanPhamRepository.save(sanPham1).getId());

        SanPham sanPham2 = new SanPham();
        sanPham2.setTen("Sản phẩm 3");
        sanPham2.setMa("SP003");
        sanPham2.setId(sanPhamRepository.save(sanPham2).getId());

        SanPham sanPham3 = new SanPham();
        sanPham3.setTen("Sản phẩm 4");
        sanPham3.setMa("SP004");
        sanPham3.setId(sanPhamRepository.save(sanPham3).getId());

        SanPham sanPham4 = new SanPham();
        sanPham4.setTen("Sản phẩm 5");
        sanPham4.setMa("SP005");
        sanPham4.setId(sanPhamRepository.save(sanPham4).getId());

        NSX nsx = new NSX();
        nsx.setTen("Nhà sản xuất 1");
        nsx.setMa("NSX001");
        nsx.setId(nsxRepository.save(nsx).getId());

        NSX nsx1 = new NSX();
        nsx1.setTen("Nhà sản xuất 2");
        nsx1.setMa("NSX002");
        nsx1.setId(nsxRepository.save(nsx1).getId());

        KhachHang khachHang = new KhachHang();
        khachHang.setDiaChi("Hà Nội");
        khachHang.setMatKhau("1");
        khachHang.setMa(GeneraterMa.gen("KH"));
        khachHang.setNgaySinh(DateTimeUtil.convertDateToTimeStampSecond());
        khachHang.setTen("Nguyễn Văn A");
        khachHang.setSdt("0328843156");
        khachHang.setId(khachHangRepository.save(khachHang).getId());

        KhachHang khachHang1 = new KhachHang();
        khachHang1.setDiaChi("Hà Nội");
        khachHang1.setMatKhau("1");
        khachHang1.setMa(GeneraterMa.gen("KH"));
        khachHang1.setNgaySinh(DateTimeUtil.convertDateToTimeStampSecond());
        khachHang1.setTen("Nguyễn Văn B");
        khachHang1.setSdt("0328843156");
        khachHang1.setId(khachHangRepository.save(khachHang1).getId());

        KhachHang khachHang2 = new KhachHang();
        khachHang2.setDiaChi("Hà Nội");
        khachHang2.setMatKhau("1");
        khachHang2.setMa(GeneraterMa.gen("KH"));
        khachHang2.setNgaySinh(DateTimeUtil.convertDateToTimeStampSecond());
        khachHang2.setTen("Nguyễn Văn C");
        khachHang2.setSdt("0328843156");
        khachHang2.setId(khachHangRepository.save(khachHang2).getId());

        NhanVien nhanVien = new NhanVien();
        nhanVien.setDiaChi("Hà Nội");
        nhanVien.setMa(GeneraterMa.gen("NV"));
        nhanVien.setGioiTinh("Nam");
        nhanVien.setMatKhau("1");
        nhanVien.setNgaySinh(DateTimeUtil.convertDateToTimeStampSecond());
        nhanVien.setSdt("00000000");
        nhanVien.setIdCh(cuaHang.getId());
        nhanVien.setIdCv(chucVu1.getId());
        nhanVien.setIdGuiBc(nhanVien.getId());
        nhanVien.setTen("Nhân Viên A");
        nhanVien.setTrangThai(1);
        nhanVien.setId(nhanVienRepository.save(nhanVien).getId());

        NhanVien nhanVien1 = new NhanVien();
        nhanVien1.setDiaChi("Hà Nội");
        nhanVien1.setMa(GeneraterMa.gen("NV"));
        nhanVien1.setGioiTinh("Nam");
        nhanVien1.setMatKhau("1");
        nhanVien1.setNgaySinh(DateTimeUtil.convertDateToTimeStampSecond());
        nhanVien1.setSdt("00000000");
        nhanVien1.setIdCh(cuaHang.getId());
        nhanVien1.setIdCv(chucVu.getId());
        nhanVien1.setIdGuiBc(nhanVien.getId());
        nhanVien1.setTen("Nhân Viên B");
        nhanVien1.setTrangThai(0);
        nhanVien1.setId(nhanVienRepository.save(nhanVien1).getId());

        NhanVien nhanVien2 = new NhanVien();
        nhanVien2.setDiaChi("Hà Nội");
        nhanVien2.setMa(GeneraterMa.gen("NV"));
        nhanVien2.setGioiTinh("Nam");
        nhanVien2.setMatKhau("1");
        nhanVien2.setNgaySinh(DateTimeUtil.convertDateToTimeStampSecond());
        nhanVien2.setSdt("00000000");
        nhanVien2.setIdCh(cuaHang.getId());
        nhanVien2.setIdCv(chucVu.getId());
        nhanVien2.setIdGuiBc(nhanVien.getId());
        nhanVien2.setTen("Nhân Viên C");
        nhanVien2.setTrangThai(1);
        nhanVien2.setId(nhanVienRepository.save(nhanVien2).getId());

        HoaDon hoaDon = new HoaDon();
        hoaDon.setDiaChi("Bắc Ninh");
        hoaDon.setMa(GeneraterMa.gen("HĐ"));
        hoaDon.setSdt("00000");
        hoaDon.setIdKh(khachHang.getId());
        hoaDon.setIdNv(nhanVien2.getId());
        hoaDon.setNgayNhan(DateTimeUtil.convertDateToTimeStampSecond());
        hoaDon.setNgayShip(DateTimeUtil.convertDateToTimeStampSecond());
        hoaDon.setNgayTao(DateTimeUtil.convertDateToTimeStampSecond());
        hoaDon.setNgayThanhToan(DateTimeUtil.convertDateToTimeStampSecond());
        hoaDon.setTenNguoiNhan("Người nhận A");
        hoaDon.setTinhTrang(0);
        hoaDon.setId(hoaDonRepository.save(hoaDon).getId());

        HoaDon hoaDon1 = new HoaDon();
        hoaDon1.setDiaChi("Bắc Ninh");
        hoaDon1.setMa(GeneraterMa.gen("HĐ"));
        hoaDon1.setSdt("00000");
        hoaDon1.setIdKh(khachHang1.getId());
        hoaDon1.setIdNv(nhanVien2.getId());
        hoaDon1.setNgayNhan(DateTimeUtil.convertDateToTimeStampSecond());
        hoaDon1.setNgayShip(DateTimeUtil.convertDateToTimeStampSecond());
        hoaDon1.setNgayTao(DateTimeUtil.convertDateToTimeStampSecond());
        hoaDon1.setNgayThanhToan(DateTimeUtil.convertDateToTimeStampSecond());
        hoaDon1.setTenNguoiNhan("Người nhận A");
        hoaDon1.setTinhTrang(0);
        hoaDon1.setId(hoaDonRepository.save(hoaDon1).getId());

        HoaDon hoaDon2 = new HoaDon();
        hoaDon2.setDiaChi("Bắc Ninh");
        hoaDon2.setMa(GeneraterMa.gen("HĐ"));
        hoaDon2.setSdt("00000");
        hoaDon2.setIdKh(khachHang.getId());
        hoaDon2.setIdNv(nhanVien2.getId());
        hoaDon2.setNgayNhan(DateTimeUtil.convertDateToTimeStampSecond());
        hoaDon2.setNgayShip(DateTimeUtil.convertDateToTimeStampSecond());
        hoaDon2.setNgayTao(DateTimeUtil.convertDateToTimeStampSecond());
        hoaDon2.setNgayThanhToan(DateTimeUtil.convertDateToTimeStampSecond());
        hoaDon2.setTenNguoiNhan("Người nhận A");
        hoaDon2.setTinhTrang(0);
        hoaDon2.setId(hoaDonRepository.save(hoaDon2).getId());

        HoaDon hoaDon3 = new HoaDon();
        hoaDon3.setDiaChi("Bắc Ninh");
        hoaDon3.setMa(GeneraterMa.gen("HĐ"));
        hoaDon3.setSdt("00000");
        hoaDon3.setIdKh(khachHang.getId());
        hoaDon3.setIdNv(nhanVien2.getId());
        hoaDon3.setNgayNhan(DateTimeUtil.convertDateToTimeStampSecond());
        hoaDon3.setNgayShip(DateTimeUtil.convertDateToTimeStampSecond());
        hoaDon3.setNgayTao(DateTimeUtil.convertDateToTimeStampSecond());
        hoaDon3.setNgayThanhToan(DateTimeUtil.convertDateToTimeStampSecond());
        hoaDon3.setTenNguoiNhan("Người nhận A");
        hoaDon3.setTinhTrang(1);
        hoaDon3.setId(hoaDonRepository.save(hoaDon3).getId());

        HoaDon hoaDon4 = new HoaDon();
        hoaDon4.setDiaChi("Bắc Ninh");
        hoaDon4.setMa(GeneraterMa.gen("HĐ"));
        hoaDon4.setSdt("00000");
        hoaDon4.setIdKh(khachHang.getId());
        hoaDon4.setIdNv(nhanVien2.getId());
        hoaDon4.setNgayNhan(DateTimeUtil.convertDateToTimeStampSecond());
        hoaDon4.setNgayShip(DateTimeUtil.convertDateToTimeStampSecond());
        hoaDon4.setNgayTao(DateTimeUtil.convertDateToTimeStampSecond());
        hoaDon4.setNgayThanhToan(DateTimeUtil.convertDateToTimeStampSecond());
        hoaDon4.setTenNguoiNhan("Người nhận A");
        hoaDon4.setTinhTrang(2);
        hoaDon4.setId(hoaDonRepository.save(hoaDon4).getId());

        ChiTietSanPham chiTietSanPham = new ChiTietSanPham();
        chiTietSanPham.setIdSanPham(sanPham.getId());
        chiTietSanPham.setGiaBan(new BigDecimal(10000));
        chiTietSanPham.setGiaNhap(new BigDecimal(1000));
        chiTietSanPham.setIdMauSac(mauSac.getId());
        chiTietSanPham.setIdDongSp(dongSp.getId());
        chiTietSanPham.setMoTa("Hàng đẹp");
        chiTietSanPham.setIdNsx(nsx.getId());
        chiTietSanPham.setSoLuong(100);
        chiTietSanPham.setNamBh(2);
        chiTietSanPham.setNgayNhap(DateTimeUtil.convertDateToTimeStampSecond());
        chiTietSanPham.setId(chiTietSanPhamRepository.save(chiTietSanPham).getId());

        ChiTietSanPham chiTietSanPham1 = new ChiTietSanPham();
        chiTietSanPham1.setIdSanPham(sanPham1.getId());
        chiTietSanPham1.setGiaBan(new BigDecimal(10000));
        chiTietSanPham1.setGiaNhap(new BigDecimal(1000));
        chiTietSanPham1.setIdMauSac(mauSac.getId());
        chiTietSanPham1.setIdDongSp(dongSp.getId());
        chiTietSanPham1.setMoTa("Hàng đẹp");
        chiTietSanPham1.setIdNsx(nsx.getId());
        chiTietSanPham1.setSoLuong(100);
        chiTietSanPham1.setNamBh(2);
        chiTietSanPham1.setNgayNhap(DateTimeUtil.convertDateToTimeStampSecond());
        chiTietSanPham1.setId(chiTietSanPhamRepository.save(chiTietSanPham).getId());

        ChiTietSanPham chiTietSanPham2 = new ChiTietSanPham();
        chiTietSanPham2.setIdSanPham(sanPham2.getId());
        chiTietSanPham2.setGiaBan(new BigDecimal(10000));
        chiTietSanPham2.setGiaNhap(new BigDecimal(1000));
        chiTietSanPham2.setIdMauSac(mauSac.getId());
        chiTietSanPham2.setIdDongSp(dongSp.getId());
        chiTietSanPham2.setMoTa("Hàng đẹp");
        chiTietSanPham2.setIdNsx(nsx.getId());
        chiTietSanPham2.setSoLuong(100);
        chiTietSanPham2.setNamBh(2);
        chiTietSanPham2.setNgayNhap(DateTimeUtil.convertDateToTimeStampSecond());
        chiTietSanPham2.setId(chiTietSanPhamRepository.save(chiTietSanPham2).getId());

        ChiTietSanPham chiTietSanPham3 = new ChiTietSanPham();
        chiTietSanPham3.setIdSanPham(sanPham3.getId());
        chiTietSanPham3.setGiaBan(new BigDecimal(10000));
        chiTietSanPham3.setGiaNhap(new BigDecimal(1000));
        chiTietSanPham3.setIdMauSac(mauSac.getId());
        chiTietSanPham3.setIdDongSp(dongSp.getId());
        chiTietSanPham3.setMoTa("Hàng đẹp");
        chiTietSanPham3.setIdNsx(nsx.getId());
        chiTietSanPham3.setSoLuong(100);
        chiTietSanPham3.setNamBh(2);
        chiTietSanPham3.setNgayNhap(DateTimeUtil.convertDateToTimeStampSecond());
        chiTietSanPham3.setId(chiTietSanPhamRepository.save(chiTietSanPham3).getId());

        ChiTietSanPham chiTietSanPham4 = new ChiTietSanPham();
        chiTietSanPham4.setIdSanPham(sanPham4.getId());
        chiTietSanPham4.setGiaBan(new BigDecimal(10000));
        chiTietSanPham4.setGiaNhap(new BigDecimal(1000));
        chiTietSanPham4.setIdMauSac(mauSac.getId());
        chiTietSanPham4.setIdDongSp(dongSp.getId());
        chiTietSanPham4.setMoTa("Hàng đẹp");
        chiTietSanPham4.setIdNsx(nsx.getId());
        chiTietSanPham4.setSoLuong(100);
        chiTietSanPham4.setNamBh(2);
        chiTietSanPham4.setNgayNhap(DateTimeUtil.convertDateToTimeStampSecond());
        chiTietSanPham4.setId(chiTietSanPhamRepository.save(chiTietSanPham4).getId());

        ChiTietSanPham chiTietSanPham5 = new ChiTietSanPham();
        chiTietSanPham5.setIdSanPham(sanPham.getId());
        chiTietSanPham5.setGiaBan(new BigDecimal(10000));
        chiTietSanPham5.setGiaNhap(new BigDecimal(1000));
        chiTietSanPham5.setIdMauSac(mauSac.getId());
        chiTietSanPham5.setIdDongSp(dongSp.getId());
        chiTietSanPham5.setMoTa("Hàng đẹp");
        chiTietSanPham5.setIdNsx(nsx.getId());
        chiTietSanPham5.setSoLuong(100);
        chiTietSanPham5.setNamBh(2);
        chiTietSanPham5.setNgayNhap(DateTimeUtil.convertDateToTimeStampSecond());
        chiTietSanPham5.setId(chiTietSanPhamRepository.save(chiTietSanPham5).getId());

        ChiTietSanPham chiTietSanPham6 = new ChiTietSanPham();
        chiTietSanPham6.setIdSanPham(sanPham.getId());
        chiTietSanPham6.setGiaBan(new BigDecimal(10000));
        chiTietSanPham6.setGiaNhap(new BigDecimal(1000));
        chiTietSanPham6.setIdMauSac(mauSac.getId());
        chiTietSanPham6.setIdDongSp(dongSp.getId());
        chiTietSanPham6.setMoTa("Hàng đẹp");
        chiTietSanPham6.setIdNsx(nsx.getId());
        chiTietSanPham6.setSoLuong(100);
        chiTietSanPham6.setNamBh(2);
        chiTietSanPham6.setNgayNhap(DateTimeUtil.convertDateToTimeStampSecond());
        chiTietSanPham6.setId(chiTietSanPhamRepository.save(chiTietSanPham6).getId());

        HoaDonChiTiet hoaDonChiTiet = new HoaDonChiTiet();
        hoaDonChiTiet.setIdHoaDon(hoaDon1.getId());
        hoaDonChiTiet.setIdChiTietSp(chiTietSanPham.getId());
        hoaDonChiTiet.setSoLuong(10);
        hoaDonChiTiet.setDonGia(new BigDecimal(10000));
        hoaDonChiTietRepository.save(hoaDonChiTiet);

        HoaDonChiTiet hoaDonChiTiet1 = new HoaDonChiTiet();
        hoaDonChiTiet1.setIdHoaDon(hoaDon1.getId());
        hoaDonChiTiet1.setIdChiTietSp(chiTietSanPham1.getId());
        hoaDonChiTiet1.setSoLuong(10);
        hoaDonChiTiet1.setDonGia(new BigDecimal(10000));
        hoaDonChiTietRepository.save(hoaDonChiTiet1);

        HoaDonChiTiet hoaDonChiTiet2 = new HoaDonChiTiet();
        hoaDonChiTiet2.setIdHoaDon(hoaDon1.getId());
        hoaDonChiTiet2.setIdChiTietSp(chiTietSanPham2.getId());
        hoaDonChiTiet2.setSoLuong(10);
        hoaDonChiTiet2.setDonGia(new BigDecimal(10000));
        hoaDonChiTietRepository.save(hoaDonChiTiet2);

        HoaDonChiTiet hoaDonChiTiet3 = new HoaDonChiTiet();
        hoaDonChiTiet3.setIdHoaDon(hoaDon1.getId());
        hoaDonChiTiet3.setIdChiTietSp(chiTietSanPham3.getId());
        hoaDonChiTiet3.setSoLuong(10);
        hoaDonChiTiet3.setDonGia(new BigDecimal(10000));
        hoaDonChiTietRepository.save(hoaDonChiTiet3);

        HoaDonChiTiet hoaDonChiTiet4 = new HoaDonChiTiet();
        hoaDonChiTiet4.setIdHoaDon(hoaDon1.getId());
        hoaDonChiTiet4.setIdChiTietSp(chiTietSanPham4.getId());
        hoaDonChiTiet4.setSoLuong(10);
        hoaDonChiTiet4.setDonGia(new BigDecimal(10000));
        hoaDonChiTietRepository.save(hoaDonChiTiet4);

        HoaDonChiTiet hoaDonChiTiet5 = new HoaDonChiTiet();
        hoaDonChiTiet5.setIdHoaDon(hoaDon1.getId());
        hoaDonChiTiet5.setIdChiTietSp(chiTietSanPham6.getId());
        hoaDonChiTiet5.setSoLuong(10);
        hoaDonChiTiet5.setDonGia(new BigDecimal(10000));
        hoaDonChiTietRepository.save(hoaDonChiTiet5);

        HoaDonChiTiet hoaDonChiTiet6 = new HoaDonChiTiet();
        hoaDonChiTiet6.setIdHoaDon(hoaDon.getId());
        hoaDonChiTiet6.setIdChiTietSp(chiTietSanPham1.getId());
        hoaDonChiTiet6.setSoLuong(10);
        hoaDonChiTiet6.setDonGia(new BigDecimal(10000));
        hoaDonChiTietRepository.save(hoaDonChiTiet6);

        HoaDonChiTiet hoaDonChiTiet7 = new HoaDonChiTiet();
        hoaDonChiTiet7.setIdHoaDon(hoaDon1.getId());
        hoaDonChiTiet7.setIdChiTietSp(chiTietSanPham2.getId());
        hoaDonChiTiet7.setSoLuong(10);
        hoaDonChiTiet7.setDonGia(new BigDecimal(10000));
        hoaDonChiTietRepository.save(hoaDonChiTiet7);

        HoaDonChiTiet hoaDonChiTiet8 = new HoaDonChiTiet();
        hoaDonChiTiet8.setIdHoaDon(hoaDon1.getId());
        hoaDonChiTiet8.setIdChiTietSp(chiTietSanPham4.getId());
        hoaDonChiTiet8.setSoLuong(10);
        hoaDonChiTiet8.setDonGia(new BigDecimal(10000));
        hoaDonChiTietRepository.save(hoaDonChiTiet8);

        HoaDonChiTiet hoaDonChiTiet9 = new HoaDonChiTiet();
        hoaDonChiTiet9.setIdHoaDon(hoaDon3.getId());
        hoaDonChiTiet9.setIdChiTietSp(chiTietSanPham6.getId());
        hoaDonChiTiet9.setSoLuong(10);
        hoaDonChiTiet9.setDonGia(new BigDecimal(10000));
        hoaDonChiTietRepository.save(hoaDonChiTiet9);

        HoaDonChiTiet hoaDonChiTiet10 = new HoaDonChiTiet();
        hoaDonChiTiet10.setIdHoaDon(hoaDon3.getId());
        hoaDonChiTiet10.setIdChiTietSp(chiTietSanPham2.getId());
        hoaDonChiTiet10.setSoLuong(10);
        hoaDonChiTiet10.setDonGia(new BigDecimal(10000));
        hoaDonChiTietRepository.save(hoaDonChiTiet10);

        HoaDonChiTiet hoaDonChiTiet11 = new HoaDonChiTiet();
        hoaDonChiTiet11.setIdHoaDon(hoaDon4.getId());
        hoaDonChiTiet11.setIdChiTietSp(chiTietSanPham1.getId());
        hoaDonChiTiet11.setSoLuong(10);
        hoaDonChiTiet11.setDonGia(new BigDecimal(10000));
        hoaDonChiTietRepository.save(hoaDonChiTiet11);

        HoaDonChiTiet hoaDonChiTiet12 = new HoaDonChiTiet();
        hoaDonChiTiet12.setIdHoaDon(hoaDon4.getId());
        hoaDonChiTiet12.setIdChiTietSp(chiTietSanPham2.getId());
        hoaDonChiTiet12.setSoLuong(10);
        hoaDonChiTiet12.setDonGia(new BigDecimal(10000));
        hoaDonChiTietRepository.save(hoaDonChiTiet12);

    }
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(DBGeneration.class);
        ctx.close();
    }
}
