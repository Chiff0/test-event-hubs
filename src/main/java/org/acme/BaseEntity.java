package org.acme

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import java.time.Instant;
import java.util.UUID;

@MappedSuperclass
public class BaseEntity extends PanacheEntityBase {

  @Column(name = "created_at")
  private Instant createdAt;

  @Column(name = "updated_at")
  private Instant updatedAt;

  @Version
  @Column(name = "version")
  protected long version;

  @PrePersist

  protected void onCreate() {
    Instant now = Instant.now();

    this.setCreatedAt(now);
    this.setUpdatedAt(now);
  }

  @PreUpdate
  protected void onUpdate() {
    this.setUpdatedAt(Instant.now());
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Instant getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Instant createdAt) {
    this.createdAt = createdAt;
  }

  public Instant getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Instant updatedAt) {
    this.updatedAt = updatedAt;
  }

  public long getVersion() {
    return version;
  }

  public void setVersion(long version) {
    this.version = version;
  }
}

