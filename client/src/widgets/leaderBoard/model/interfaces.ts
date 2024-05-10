export interface ILeaderBoardUser {
	user_id: number;
	name: string;
	surname: string;
	login: string;
	score: number;
}

export interface LeaderBoardUserProps extends ILeaderBoardUser {
	pos: number;
}
