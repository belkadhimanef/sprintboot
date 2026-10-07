package tn.esprit.manef_belkadhi_4sssa3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.manef_belkadhi_4sssa3.entities.Maintenance;

public interface MaintenanceRepository extends JpaRepository<Maintenance, Long> {
}
