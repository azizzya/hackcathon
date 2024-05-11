import { IResponseLogIn, IUserLogIn } from '../interfaces/user.interfaces';
import instance from './axios.api';

class AuthService {
	async logIn(user: IUserLogIn) {
		return instance.post<IResponseLogIn>('/auth', user); //дописать возвращаемый тип
	}
}

export const authService = new AuthService();
