import { userService } from '@/shared/api/user.service';
import { useQuery } from '@tanstack/react-query';

export function useLeaderBoard() {
	return useQuery({
		queryKey: ['users', 'leaderboard'],
		queryFn: () => userService.getLeaders(),
		select: ({ data }) => data,
	});
}
