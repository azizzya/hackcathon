import { ITamagotchi } from './tamagotchi.interfaces';
import { ITask } from './task.interfaces';

export interface IUser {
	user_id: number;
	surname: string;
	name: string;
	coins: number;
	level: number;
	tamagotсhi: ITamagotchi; // пока непонятно какие данные с бека летят
	tasks: ITask[]; //возможно поменяется
}

export interface IUserProfile {
	user_id: number;

	coin_balance: number;
	father_name: string;
	firstname: string;
	lastname: string;
	username: string;

	profileImg: string;
	qrCodeImg: string;
}

export interface ILeader {
	user_id: number;
	firstname: string;
	lastname: string;
	username: string;
	coin_balance: number;
	profileImg: string;
}

export interface IUserLogIn {
	username: string;
	password: string;
}

export interface IResponseLogIn {}
//дописать возвращаемый тип
