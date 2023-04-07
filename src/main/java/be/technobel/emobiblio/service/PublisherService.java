package be.technobel.emobiblio.service;

import be.technobel.emobiblio.models.dto.PublisherDTO;
import be.technobel.emobiblio.models.entity.Publisher;

import java.util.List;

public interface PublisherService {
    public List<PublisherDTO> findAllPublishers();

    public PublisherDTO findPublisherById(Long id);

    public void createPublisher(PublisherDTO publisher);

    public void updatePublisher(PublisherDTO publisher);

    public void deletePublisher(Long id);
}
