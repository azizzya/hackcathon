export interface ILeaderBoardUser {
	user_id: number;
	name: string;
	score: number;
}

export interface LeaderBoardUserProps extends ILeaderBoardUser {
	pos: number;
}
