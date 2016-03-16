package services.spring;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Created by oleksii.khilkevych on 3/16/2016.
 */
@Service("authenticationService")
public class SpringSecurityAuthProvider implements UserDetailsService {

    public UserDetails loadUserByUsername(String email)
            throws UsernameNotFoundException {
//        Map<String, Object> parameters = new HashMap<>();
//        parameters.put(Person.EMAIL, email);
//
//        Person person = managerFacade.getPersonGenericDAO().findSingleResultByNamedQuery(Person.FIND_BY_EMAIL, parameters);
//        GrantedAuthority authority = new SimpleGrantedAuthority(person.getRole());
//        UserDetails userDetails = (UserDetails) new User(person.getEmail(),
//                person.getPassword(), Arrays.asList(authority));
//        return userDetails;
        return null;
    }

}
