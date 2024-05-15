import { IUserLogIn } from '../interfaces/user.interfaces';
import instance from './axios.api';

class AuthService {
	async auth(user: IUserLogIn) {
		return instance.post('/auth', user);
	}
}

export const authService = new AuthService();
