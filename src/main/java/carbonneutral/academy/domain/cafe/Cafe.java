package carbonneutral.academy.domain.cafe;

import carbonneutral.academy.common.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Getter
@Builder
@Entity
@Table(name = "cafe")
public class Cafe extends BaseEntity {

    @Id
    @Column(name = "cafe_id", nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String location;

    //반납 가능 여부
    @Column(nullable = false)
    private boolean isReturnable;


}
