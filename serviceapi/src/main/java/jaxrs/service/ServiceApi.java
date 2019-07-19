package jaxrs.service;

import jaxrs.dto.HumanDto;

import javax.ejb.Remote;
import java.util.List;

@Remote
public interface ServiceApi {


    public void addHuman(HumanDto humanDto);

    public List<HumanDto> getHumans();
}
