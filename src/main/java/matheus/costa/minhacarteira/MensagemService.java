package matheus.costa.minhacarteira;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("production")
public class MensagemService {
	
	@Value("${application.name}")
	private String appname;

}

