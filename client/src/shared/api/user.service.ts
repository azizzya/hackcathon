import { ILeader, IUserProfile } from '../interfaces/user.interfaces';
import instance from './axios.api';

class UserService {
	async getProfile() {
		return instance.get<IUserProfile>('/user/profile');
	}
	async getLeaders() {
		return instance.get<ILeader[]>('/user/leaders');
	}
}

export const userService = new UserService();
