package jaxrs.serviceimpl;

import jaxrs.converter.HumanConverter;
import jaxrs.dao.HumanDaoImpl;
import jaxrs.dto.HumanDto;
import jaxrs.service.ServiceApi;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import java.util.List;

@Stateless
@Remote
public class ServiceImpl implements ServiceApi {
    @Override
    public List<HumanDto> getHumans() {
        HumanDaoImpl humanDao = new HumanDaoImpl();
       return HumanConverter.convertToHumanDtoList(humanDao.getHumans());
    }

    @Override
    public void addHuman(HumanDto humanDto) {
        HumanDaoImpl humanDao = new HumanDaoImpl();
        humanDao.addHuman(HumanConverter.convertToHuman(humanDto));
    }
}
