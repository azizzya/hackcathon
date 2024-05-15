import { ILeader, IUserProfile } from '../interfaces/user.interfaces';
import instance from './axios.api';

class UserService {
	async getProfile() {
		return instance.get<IUserProfile>('/users/profile');
	}
	async getLeaders() {
		return instance.get<ILeader[]>('/users/leadersboard');
	}
}

export const userService = new UserService();
