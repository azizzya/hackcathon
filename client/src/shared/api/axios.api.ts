import axios from 'axios';
import { getTokenFromLocalStorage } from '../helpers/localStorage.helper';

const instance = axios.create({
	baseURL: 'http://localhost:8080/',
	headers: {
		Authorization: 'Bearer ' + getTokenFromLocalStorage(),
	},
});

instance.interceptors.request.use(
	config => {
		const token = getTokenFromLocalStorage();
		if (token) {
			config.headers.Authorization = `Bearer ${token}`;
		}
		return config;
	},
	error => {
		return Promise.reject(error);
	}
);

export default instance;
