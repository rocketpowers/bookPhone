package classPackages.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import classPackages.model.Contacts;

public interface ContactsRepository extends JpaRepository<Contacts, Integer> {

}
