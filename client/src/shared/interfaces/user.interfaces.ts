import { ITamagotchi } from './tamagotchi.interfaces';
import { ITask } from './task.interfaces';

export interface IUser {
	id: number;
	surname: string;
	name: string;
	coins: number;
	level: number;
	tamagotсhi: ITamagotchi; // пока непонятно какие данные с бека летят
	tasks: ITask[]; //возможно поменяется
}

export interface IUserLogIn {
	login: string;
	password: string;
}

export interface IResponseLogIn {}
//дописать возвращаемый тип
