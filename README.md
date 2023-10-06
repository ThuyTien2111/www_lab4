# Lab 4 Spring Boot Project

Dự án Lab 4 Spring Boot là một ứng dụng Spring Boot đơn giản dùng để quản lý kỹ năng (skills). Dự án này bao gồm các gói (packages) và các lớp sau:

## Các Package

1. **dao**: Gói này chứa các lớp liên quan đến truy cập dữ liệu. Trong đó có lớp `SkillDao` với các phương thức quản lý kỹ năng như `getAllSkills`, `getSkillById`, `addSkill`, `updateSkill`, `deleteSkill`.

2. **entities**: Gói này chứa các lớp đại diện cho các thực thể trong ứng dụng, bao gồm `Address`, `Candidate`, `CandidateSkill`, `Company`, `Job`, `JobSkill`, và `Skill`.

3. **edu.iuh.fit**: Gói chứa lớp `Lab4Application` là lớp chính của ứng dụng Spring Boot.

## Lab4Application

Lớp chính của ứng dụng nằm trong package `edu.iuh.fit` và có tên là `Lab4Application`. Dưới đây là một số thông tin về lớp này:

```java
@SpringBootApplication
public class Lab4Application {

    public static void main(String[] args) {
        SpringApplication.run(Lab4Application.class, args);
    }

    @Autowired
    private SkillDao skillDao;

    @Bean
    CommandLineRunner x() {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                // Các hành động khởi tạo hoặc kiểm tra dữ liệu
                // Ví dụ: skillDao.getSkillById(UUID.fromString("2b6e0ecb-5e90-4df1-9fb0-8b66221e3a1f"))
                // skillDao.getAllSkills().forEach(s -> System.out.println(s.toString()))
                // skillDao.addSkill(new Skill(UUID.randomUUID(), "Database Administration", "Database Administration", (byte) 2))
                // skillDao.updateSkill(new Skill(UUID.fromString("1926efda-1711-4dcf-a22e-0f7a6ecee06b"), "Database Administration description", "Database Administration", (byte) 1))
            }
        };
    }
}
```
# Unit Testing

Các unit test cho dự án được định nghĩa trong package `edu.iuh.fit.lab4`. Hiện tại, chúng ta có một lớp `SkillDaoApplicationTest` để kiểm tra các phương thức của `SkillDao`. Dưới đây là một số testcase ví dụ:

- `testGetAllSkills`: Kiểm tra phương thức `getAllSkills` để đảm bảo rằng danh sách các kỹ năng trả về có đúng kích thước mong đợi.

- `testGetSkillById`: Kiểm tra phương thức `getSkillById` để đảm bảo rằng kỹ năng được trả về dựa trên ID là chính xác.

- `testAddSkill`: Kiểm tra phương thức `addSkill` để đảm bảo rằng kỹ năng mới được thêm vào cơ sở dữ liệu.

- `testUpdateSkill`: Kiểm tra phương thức `updateSkill` để đảm bảo rằng cập nhật kỹ năng thành công.

- `testDeleteSkill`: Kiểm tra phương thức `deleteSkill` để đảm bảo rằng kỹ năng bị xóa khỏi cơ sở dữ liệu.

## Cấu hình Ứng dụng

Cấu hình ứng dụng được lưu trong tệp `application.properties`. Dự án này sử dụng cơ sở dữ liệu MariaDB và có các cài đặt sau:

- `spring.datasource.driver-class-name`: Tên lớp driver của MariaDB.
- `spring.datasource.url`: URL kết nối đến cơ sở dữ liệu.
- `spring.datasource.username`: Tên đăng nhập vào cơ sở dữ liệu.
- `spring.datasource.password`: Mật khẩu đăng nhập vào cơ sở dữ liệu.
- `spring.jpa.hibernate.ddl-auto`: Cài đặt tự động tạo bảng (update để cập nhật).
- `spring.jpa.show-sql`: Hiển thị các câu lệnh SQL được thực thi trong log.

## Chạy Ứng dụng

Để chạy ứng dụng, bạn chỉ cần chạy phương thức `main` trong lớp `Lab4Application`. Ứng dụng sẽ khởi động và cấu hình cơ sở dữ liệu MariaDB theo cài đặt trong `application.properties`. Sau đó, bạn có thể sử dụng các phương thức DAO đã được triển khai trong package `dao` để quản lý kỹ năng.

## Unit Testing

Để chạy các unit test, bạn có thể sử dụng một framework kiểm thử như JUnit. Các testcase đã được định nghĩa trong lớp `SkillDaoApplicationTest`. Chúng sẽ kiểm tra các phương thức DAO để đảm bảo tính đúng đắn và hiệu suất của chúng.

## Lưu ý

- Đảm bảo rằng bạn đã cấu hình cơ sở dữ liệu MariaDB với thông tin đăng nhập và mật khẩu đúng trong tệp `application.properties`.

- Trước khi chạy các testcase, hãy xem xét cách bạn muốn cài đặt dữ liệu ban đầu trong cơ sở dữ liệu (bạn có thể bỏ comment phần `setUp` trong lớp `SkillDaoApplicationTest`).

- Hãy cập nhật các phần trong ứng dụng và testcases để phù hợp với nhu cầu cụ thể của bạn.
